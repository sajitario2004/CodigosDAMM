package ejercicios;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su direccion");
        String direccion = sc.nextLine();
        System.out.println("Ingrese su telefono");
        String telefono = sc.nextLine();

        System.out.println("Su nombre es " + nombre + " su direccion es " + direccion + " su telefono es " + telefono);
    }
}
