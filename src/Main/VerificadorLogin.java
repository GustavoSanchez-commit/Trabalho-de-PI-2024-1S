package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ModuloConexao;

public class VerificadorLogin {
    
    public static boolean verificarLogin(String username, String senha) {
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

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
