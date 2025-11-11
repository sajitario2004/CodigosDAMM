package edu.dam.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class DatabaseConnection {
    private static final String url = "jdbc:sqlite:src/main/resources/dispositivos.db";

    public static Connection getConection() throws SQLException{
        return (Connection) (DriverManager.getConnection(url));
    }

    public static void iniciar(){
        String crear = "CREATE TABLE IF NOT EXISTS dispositivos ("+
        "id INTEGER PRIMARY KEY AUTOINCREMENT, "+
        "nombre TEXT NOT NULL, "+
        "categoria TEXT, "+
        "precio REAL, "+
        "stock INTEGER);";

        try (Connection c = DriverManager.getConnection(url); Statement st = c.createStatement()){
            st.execute(crear);
            System.out.println("La base de datos se conecto correcta mente");
            c.close();
        } catch (Exception e) {
            System.out.println("La base de datos falla por: " + e.getMessage());
        }
    }

}
