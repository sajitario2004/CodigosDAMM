package u1.serializacion.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

/**
 * Convierte el ejercicio del Personaje para que, en lugar de usar serialización binaria, guarde los datos en un archivo personaje.json usando la librería Gson.
 * Después, carga el archivo y reconstruye el objeto.
 */




class Personaje implements Serializable {
    private static final long serialVersionUID = 1L; // NOTA: el Serializable y esta línea son necesarios para el ejercicio 3, no para este
    private String nombre;
    private int nivel;
    private int puntosVida;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosVida=" + puntosVida +
                '}';
    }
}

public class EjercicioJSON_1 {
    private static final String FILE = "personaje.json";

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Crear personaje
        Personaje p = new Personaje("Geralt", 25, 500);

        // Guardar en JSON
        try (Writer writer = new FileWriter(FILE)) {
            gson.toJson(p, writer);
            System.out.println("Personaje guardado en " + FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer desde JSON
        try (Reader reader = new FileReader(FILE)) {
            Personaje cargado = gson.fromJson(reader, Personaje.class);
            System.out.println("Personaje cargado: " + cargado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
