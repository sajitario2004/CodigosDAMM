import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;

public class SerializacionGson {

    private static Scanner sc = new Scanner(System.in);
    private static Gson gson = new Gson();
    private static String archivo = "personajes.json";
    public static void main(String[] args) {
        int input = 0;
        while (input >= 0 && input < 3) {
            System.out.println("Elige una de las siguientes opciones");
            System.out.println("1. crear personaje");
            System.out.println("2. listar personajes");
            input = sc.nextInt();

            switch (input) {
                case 1 -> crearPersonaje();
                case 2 -> listarPersonajes();
                default -> System.exit(0);
            }
        }

    }

    public static void crearPersonaje() {
        System.out.print("Nombre del personaje: ");
        String nombre = sc.next();

        System.out.print("Nivel: ");
        int nivel = sc.nextInt();

        System.out.print("Clase (Mago, Guerrero, etc.): ");
        String clase = sc.next();

        Personaje nuevo = new Personaje(nombre, nivel, clase);

        // Leer la lista actual (si existe)
        List<Personaje> lista = leerLista();

        // Agregar el nuevo personaje
        lista.add(nuevo);

        // Guardar la lista completa otra vez
        try {
            FileWriter w = new FileWriter(archivo);
            w.write(gson.toJson(lista));
            w.close();
            System.out.println(" Personaje guardado correctamente.");
        } catch (IOException e) {
            System.out.println(" Error al guardar el archivo.");
        }
    }

    public static void listarPersonajes() {
        List<Personaje> lista = leerLista();

        if (lista.isEmpty()) {
            System.out.println(" No hay personajes guardados.");
        } else {
            System.out.println("\n Lista de personajes:");
            for (Personaje p : lista) {
                System.out.println(p);
            }
        }
    }

    public static List<Personaje> leerLista() {
        List<Personaje> lista = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            Personaje[] array = gson.fromJson(br, Personaje[].class);
            br.close();

             // por si el archivo esta vacio
            if (array != null) {
                lista = new ArrayList<>(Arrays.asList(array));
            }

        } catch (FileNotFoundException e) {
            System.out.println(" Error el archivo no existe o no se encuantra o esta vacio.");
        } catch (IOException e) {
            System.out.println(" Error al leer el archivo.");
        }

        return lista;
    }
}
