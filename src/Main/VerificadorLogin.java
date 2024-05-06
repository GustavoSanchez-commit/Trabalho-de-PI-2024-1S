package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModuloConexao;
    
public class VerificadorLogin {

    public static ResultadoLogin verificarLogin(String username, String senha) {
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

            // Verifica se há um próximo registro no ResultSet
            boolean encontrado = rs.next();

            // Se encontrado for verdadeiro, significa que o login foi bem-sucedido
            if (encontrado) {
                String perfil = rs.getString(5);
                if (perfil.equals("usuario")) { 
                    JOptionPane.showMessageDialog(null, "Bem-vindo, " + rs.getString(2), "Login Bem-Sucedido", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println(rs.getInt(1));
                    return new ResultadoLogin(true, rs.getInt(1));
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado ou senha incorreta.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Se ocorrer alguma exceção ou não, garanta que os recursos sejam fechados
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
        
        return new ResultadoLogin(false, -1); // Retorna um resultado de login inválido
    }
}

class ResultadoLogin {
    private boolean sucesso;
    private int idUsuario;

    public ResultadoLogin(boolean sucesso, int idUsuario) {
        this.sucesso = sucesso;
        this.idUsuario = idUsuario;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
