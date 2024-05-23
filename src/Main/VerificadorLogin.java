package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModuloConexao;
import model.Usuario;

public class VerificadorLogin {
    public static Usuario usuarioLogado; 

    public static Usuario verificarLogin(String username, String senha) {
        Connection conexao = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conexao = ModuloConexao.conectar();

            String sql = "SELECT * FROM tbusuario WHERE username = ? AND senha = ?";
            pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, senha);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String perfil = rs.getString("perfil");
                String nome = rs.getString("nome");

                if ("usuario".equals(perfil)) {
                    JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome, "Login Bem-Sucedido", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println(id);
                    setUsuarioLogado(new Usuario(id, username, senha, perfil));
                    return getUsuarioLogado();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado ou senha incorreta.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null; 
    }

    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

        public static void setUsuarioLogado(Usuario aUsuarioLogado) {
        usuarioLogado = aUsuarioLogado;
    }
}
