package com.unisabana.edu.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Conexion {
    public static Connection conectar() {
        Connection con = null;

        String password = "jabulani123";
        String usuario = "postgres";
        String url = "jdbc:mysql://localhost:5432/CRUD=" + usuario
                + "&password=" + password;
        try {
            con = DriverManager.getConnection(url);
            if (con != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return con;
    }
}
