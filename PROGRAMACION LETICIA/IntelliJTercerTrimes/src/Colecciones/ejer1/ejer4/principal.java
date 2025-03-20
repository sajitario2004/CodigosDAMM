package Colecciones.ejer1.ejer4;
import java.util.*;

public class principal {
    public static void main(String[] args) {
        HashMap<String, String> usuarios = new HashMap<>();
        usuarios.put("usuario1", "clave1");
        usuarios.put("usuario2", "clave2");
        usuarios.put("admin", "admin123");

        Scanner scanner = new Scanner(System.in);
        int intentos = 3;
        boolean accesoPermitido = false;

        while (intentos > 0 && !accesoPermitido) {
            System.out.println("Ingrese su nombre de usuario:");
            String usuario = scanner.nextLine();

            System.out.println("Ingrese su contraseña:");
            String contraseña = scanner.nextLine();

            if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contraseña)) {
                accesoPermitido = true;
                System.out.println("Ha accedido al área restringida.");
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Usuario o contraseña incorrectos. Le quedan " + intentos + " intento(s).");
                } else {
                    System.out.println("Lo siento, no tiene acceso al área restringida.");
                }
            }
        }

        scanner.close();
    }
}