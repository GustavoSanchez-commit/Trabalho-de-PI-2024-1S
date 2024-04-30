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
            
            // Verifica se há um próximo registro no ResultSet
            boolean encontrado = rs.next();
            
            // Se encontrado for verdadeiro, significa que o login foi bem-sucedido
            if(encontrado){
                String perfil = rs.getString(5);
                if(perfil.equals("usuario")){
                    System.out.println(rs.getString(2));
                }
            }

            return encontrado;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            // Se ocorrer alguma exceção ou não, garanta que os recursos sejam fechados
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
