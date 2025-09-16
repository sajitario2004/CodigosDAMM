package ejercicios;

import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) {
        /**
         * Una simple division con 2 variable muy sencilla
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su primera nota");
        double nota1 = sc.nextDouble();
        System.out.println("Ingrese su segunda nota");
        double nota2 = sc.nextDouble();
        double nota_Resultado = nota1 / nota2;
        System.out.println("La media de tus notas es es: " + nota_Resultado);
    }
}
