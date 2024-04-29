package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Registros {
    private static final String url = "jdbc:mysql://localhost:3306/bancoPi"; // URL do seu banco de dados e sua database
    private static final String usuarioBanco = "root"; // Coloque o seu usuário do seu banco de dados
    private static final String senhaBanco = "2127"; // Coloque sua senha do seu banco de dados

    public static void registrarUsuario(String nome, String username, String senha) {
        try {
            // Criar conexão com o banco de dados
            Connection conexao = DriverManager.getConnection(url, usuarioBanco, senhaBanco); 

            // Definir os comandos SQL para inserir os dados
            String sql = "INSERT INTO tbusuario (nome, username, senha) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, nome);
            pstmt.setString(2, username);
            pstmt.setString(3, senha);
            pstmt.executeUpdate();
            // Fechar o envio de dados 
            pstmt.close();
            conexao.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no registro, Tente Novamente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
