package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModuloConexao {
    public static Connection conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bancoPi";
        String usuario = "root";
        String senha = "2127";

        return DriverManager.getConnection(url, usuario, senha);
    }
}
    