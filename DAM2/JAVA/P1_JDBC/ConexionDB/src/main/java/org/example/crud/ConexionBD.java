package org.example.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// por si lees esto primero profe, primero ejecuta el scriptsql y tienes que tener creado el usuario "prueba" con contraseña "1234"
public class ConexionBD{
    private static final String url = "jdbc:mysql://localhost:3306/tcg";
    private static final String usuario = "prueba";
    private static final String contraseña = "1234";
    public static Connection conectar() {
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println(" Conexion establecida correctamente.");
        } catch (SQLException e) {
            System.out.println(" Error al conectar con la base de datos:");
            e.printStackTrace();
        }

        return conexion;
    }
}

