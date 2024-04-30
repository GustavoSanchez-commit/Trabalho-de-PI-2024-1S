package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModuloConexao;

public class Registros {
    public static void registrarUsuario(String nome, String username, String senha) {
        Connection conexao = null;
        PreparedStatement pstmt = null;
        
        try {
            conexao = ModuloConexao.conectar();

            String sql = "INSERT INTO tbusuario (nome, username, senha, perfil) VALUES (?, ?, ?, ?)";
            pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, nome);
            pstmt.setString(2, username);
            pstmt.setString(3, senha);
            pstmt.setString(4, "usuario");
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuário registrado com sucesso.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no registro, Tente Novamente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
