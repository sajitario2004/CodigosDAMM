
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("la lista del archivo txt tiene a las siguientes personas");
        List<Empleado> empleados = leerEmpleados("empleados.txt");
    }

    public static List<Empleado> leerEmpleados(String rutaString) {
        List<Empleado> returnEmpleados = new ArrayList();

        try (BufferedReader rd = new BufferedReader(new FileReader(rutaString))) {
            String aux;
            Empleado empleadoAUX = new Empleado();
            boolean notFirst = false;

            while ((aux = rd.readLine()) != null) {
                String[] lista = aux.split(";");
                if (notFirst){
                    empleadoAUX.setNombre(lista[0]);
                    empleadoAUX.setEdad(Integer.parseInt(lista[1]));
                    empleadoAUX.setDepartamento(lista[1]);
                }
                notFirst = true;
            }

        }catch (Exception e) {
            System.out.println(" No se ha podido leer el archivo. ");
        }
        return null;
    }
}
