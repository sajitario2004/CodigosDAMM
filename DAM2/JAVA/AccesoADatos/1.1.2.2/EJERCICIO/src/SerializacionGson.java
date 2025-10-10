import java.util.Scanner;
// Asegúrate de tener la librería Gson en tu proyecto

import com.google.gson.Gson;


public class SerializacionGson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Usamos GsonBuilder para formatear el JSON (pretty printing)
        Gson gson = new Gson();

        // 1. Pedir datos y crear objeto
        System.out.print("Nombre del Personaje: ");
        String nombre = sc.nextLine();
        System.out.print("Nivel: ");
        int nivel = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Puntos: ");
        int puntos = sc.nextInt();

        Personaje nuevoPersonaje = new Personaje(nombre, nivel, puntos); 

        // TODO: Serializar 'nuevoPersonaje' a JSON string.
        
        // TODO: Guardar el JSON string en "personaje.json".
        
        // TODO: Leer el JSON string del fichero.
        
        // TODO: Deserializar el JSON a un nuevo objeto Personaje.
        
        // TODO: Mostrar el objeto deserializado.
        
        sc.close();
    }
}
