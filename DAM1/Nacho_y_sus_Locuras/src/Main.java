import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        //por ultimo necesitamos un nombre para nuestra base de datos
        String bd = "pruebaNachoSQL";

        Connection baseDatos = ConectarBD(bd);

        //una vez finalicemos nuestras consultas a bases de datos haremos lo siguiente, llamaremos a desconexion
        // y le pasaremos nuestra variable connection llamada baseDatos para cerrar todos los procesos y que el pc no exlote
        Deconexion(baseDatos);
    }

    //creamos un nuevo metodo para crear nuestra conexion con el servidor mysql
    public static Connection ConectarBD(String bd) {
        Connection conexion;

        //definimos nuestro host o url de nuestra base de datos a un String
        String host = "jdbc:mysql://localhost:3306/";

        //declaramos el usuario de nuestra base de datos tambien en un String
        String user = "nacho";
        String pass = "administrador";



        System.out.println("cargando...");


        //Las conexiones a base de datos son muy exquisitas, hay que hacer un try catch por si no se conecta o no la encuentra
        // si no no ara ni la prueba y dara error
        try {

            //con conexion le enviaremos los siguientes datos para que se conecte a la basae de datos
            // importante se concatenara bd a host por que hay que imaginar que bd sera la carpeta y host es donde buscamos esa carpeta
            //recomendable hacerlo asi por que el hombre del video dice que si se coloca dentro de host puede haber mas de una base a
            // a la que queramos consultar y por eso se hace un host y luego la bd
            conexion = DriverManager.getConnection(host + bd, user, pass);
            System.out.println("conexion exitosa");

        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        return conexion;
    }


    //esto lo que hara es cerrar todas las conexiones para que basicamente el sistema no implosione
    public static void Deconexion (Connection cb) {
        try {
            cb.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

}