
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VerificadorLogin {
    private static final String url = "jdbc:mysql://localhost:3306/bancoPi";
    private static final String usuarioBanco = "root"; 
    private static final String senhaBanco = "2127"; 

    public static boolean verificarLogin(String username, String senha) {
        try {
            Connection conexao = DriverManager.getConnection(url, usuarioBanco, senhaBanco);

            String sql = "SELECT * FROM listaUx WHERE username = ? AND senha = ?";
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, senha);
            ResultSet rs = pstmt.executeQuery();

            boolean encontrado = rs.next();
            rs.close();
            pstmt.close();
            conexao.close();

            return encontrado;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
