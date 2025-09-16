package org.example;

import java.sql.*;
//------------------------------------------------recuerda actualizar el pom.xml------------------------------------------------>
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:1521/jdbc?serverTimezon=UTC";
        String user = "root";
        String password = "root";

        //hay que hacer un try catch si no no funcionara la conexion
        //esto lo hace java por si la conexion a la base de datos no existe
        try {
            //con esto ya estamos conectados a nuestra base de datos
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            //Aqui acabamos de hacer una consulta a la base de datos para saber todos los datos que contenga
            //la tabla USUARIOS, resumiendo resultSet Tiene todos los datos de la tabla USUARIO
            ResultSet resultSet = statement.executeQuery("SELECT * FROM USUARIOS");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("id") + " | " + resultSet.getString("usuario"));
            }

            //como las bases de datos suelen consumir muchos recursos hay que cerrar:
            //tanto las conexiones (connection)
            //como los comandos (statement)
            //como los resultados (resultSet)
            //esto funciona como el scanner simpre esta a la escucha por si quieres enviar datos a una variable
            //este habra que cerrarlos por que si no consumira muchos recursos
            connection.close();
            statement.close();
            resultSet.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
}