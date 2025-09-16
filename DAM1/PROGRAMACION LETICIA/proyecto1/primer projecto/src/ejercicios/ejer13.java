package ejercicios;

import java.util.Scanner;

public class ejer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        boolean mayor = edad >= 18 ? true : false;
        //System.out.println("eres mayor de edad" + mayor);
        String mensaje=mayor ? "usted es mayor":"Eres menor";
        System.out.println(mensaje);
    }
}
