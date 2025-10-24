import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


/**
 * Recoge la informacion de un archivo txt para deserializarlo a una lista de empleados
 * Envia la informacion de la lista de empleados a un archivo json 
 * Al producir cualquier error se guardara en un log
 * 
 * <p>Ejemplo de uso:
 * <pre>en una empresa <code>
 * Empleados em = new Empleados();
 * List<Empelados> listaEmpleados = listarEmpleadosTXT(empelados);
 * guardarJson(listaEmpleados, empleadoJSON);
 * </code></pre>
 * 
 * @author Ignacio Toledano Caneo
 * @version 1.0
 * @since 1.0
 * @see Empleado
 * @see AlbumData
 */

public class Main {
    public static void main(String[] args) throws Exception {

        // archivos
        String empleadosTXT = "src/empleados.txt";
        String empleadoJSON = "src/empleados.json";
        String empleadoLOG = "src/empleados.log";


        System.out.println("Aqui tienes el contenido de el archivos empleados.txt: ");
        List<Empleado> listaEmpleados = listarTXTEmpleados(empleadosTXT);
        leerLista(listaEmpleados);

        System.out.println("Ahora los empleados se guardaran en un archivos JSON llamdo " + empleadoJSON);
        guardarJson(listaEmpleados, empleadoJSON);

        escribirLogDeError("error inesperado ", empleadoLOG);
    }

    // Esta funcion se le pasa solo la ruta del archivo txt para devolver una lista de empleados.
    public static List<Empleado> listarTXTEmpleados(String rutaString) {
        List<Empleado> returnEmpleados = new ArrayList<Empleado>();

        try (BufferedReader rd = new BufferedReader(new FileReader(rutaString))) {
            String aux;
            Empleado empleadoAUX = new Empleado();
            //Evitamos que coja la primera linea ya que no tiene contenido 
            boolean notFirst = false;

            while ((aux = rd.readLine()) != null) {
                String[] lista = aux.split(";");
                if (notFirst){
                    empleadoAUX.setNombre(lista[0]);
                    empleadoAUX.setEdad(Integer.parseInt(lista[1]));
                    
                    //aqui por si quieres forzar un error para el log
                    // empleadoAUX.setEdad(lista[1]);
                    
                    empleadoAUX.setDepartamento(lista[2]);
                    returnEmpleados.add(empleadoAUX);
                }
                notFirst = true;
            }

        }catch (Exception e) {
           String error = (" No se ha podido leer el archivo. ");
           escribirLogDeError(error, "src/empleados.log");
        }
        return returnEmpleados;
    }

    //leemos la lista de empleados con un foreach y lugo la imprimimos para mostrasela a la persona
    public static void leerLista(List<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }

    }

    // guardar la lista de empleados recogida del txt para serializarla en un json
    public static void guardarJson(List<Empleado> empleados, String archivo){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            FileWriter w = new FileWriter(archivo);
            //le damos formato json para que a la hora de guardarse se guarde con formato json
            w.write(gson.toJson(empleados));
            w.close();
            System.out.println("Se ha guardado correctamente en el archivo json los empleados. ");
            // int num = 0/0;
        } catch (Exception e) {
            String error = " Ha fallado la subida de archivos a json. ";
            escribirLogDeError(error, "src/empleados.log");
        } 
    }

    // Archivamos todos los errores que pueda dar el programa en un archivo log
    public static void escribirLogDeError(String error, String archivo){
        try {
            FileWriter w = new FileWriter(archivo, true);
            Date fecha = new Date();
            String errorMod = fecha + ".  Ha ocurrido el error: " + error + " en el dia. " ;
            w.write(errorMod);
            w.close();
        } catch (Exception e) {
            // En caso de que de un error tambien el escribir en el log se mostrara un error en terminal 
            System.err.println("Ha ocurrido un error tan grave que no se guardara en el LOG");
        }
    }
}
