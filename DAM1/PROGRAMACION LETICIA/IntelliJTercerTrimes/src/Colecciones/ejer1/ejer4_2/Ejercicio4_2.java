package Colecciones.ejer1.ejer4_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio4_2 {public static void main(String[] args) {
    /**
     * Implementa el control de acceso al área restringida de un programa. Se debe
     * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
     * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
     * El usuario tendrá un número ilimitado de intentos, hasta que pulse -1. Si se
     * agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área
     * restringida”. Los nombres de usuario con sus correspondientes contraseñas
     * deben estar almacenados en una estructura de la clase HashMap. Además
     * existirá otro mapa donde se vayan almacenando las contraseñas, el mapa tendrá
     * la clave el nombre del usuario y el valor una colección de contraseñas.
     */
    HashMap<String, String> mapa = new HashMap<String, String>();
    mapa.put("Juan", "1234");
    mapa.put("Ana", "abc43");
    mapa.put("Lucia", "contraseña");
    mapa.put("Claudia", "abcd");
    mapa.put("Antonio", "1b3d");
    //HashMap<String, ArrayList<String>> mapaIncorrectas = new HashMap<String, ArrayList<String>>();
    HashMap<String, String[]> mapaIncorrectas= new HashMap<String, String[]>();
    boolean acertada = false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce tu nombre");
    String nombre = sc.next();
    // Compruebo que el nombre existe en el mapa
    if (mapa.containsKey(nombre)) {

        System.out.println("Introduce la contraseña");
        String contrasena = sc.next();


        while (!contrasena.equals("-1") && !acertada) {
            // Verificar si la contraseña es correcta
            if (contrasena.equals(mapa.get(nombre))) {
                acertada = true;
                System.out.println("¡Has accedido al área restringida!");
            } else {
                System.out.println("Contraseña incorrecta. Inténtalo de nuevo (-1 para salir): ");

                if (mapaIncorrectas.containsKey(nombre)) {
                    String[] aux = Arrays.copyOf(mapaIncorrectas.get(nombre), mapaIncorrectas.get(nombre).length+1);
                    aux[aux.length-1] = contrasena;
                    mapaIncorrectas.put(nombre, aux);
                } else {
                    String[] lista = new String[1];
                    lista[0] = contrasena;
                    mapaIncorrectas.put(nombre, lista);
                }

                String[] contrasenasIncorrectas= mapaIncorrectas.get(nombre);
                // Mostrar las contraseñas incorrectas almacenadas
                System.out.print("Contraseñas incorrectas almacenadas: ");
                for (int i = 0; i < contrasenasIncorrectas.length && contrasenasIncorrectas[i] != null; i++) {
                    System.out.print(contrasenasIncorrectas[i] + " ");
                }
                System.out.println();
            }

            contrasena = sc.next();
        }

        if (!acertada && "-1".equals(contrasena)) {
            System.out.println("Saliendo del programa...");
        }

    } else {
        System.out.println("El usuario no existe en el mapa");
    }
}
}
