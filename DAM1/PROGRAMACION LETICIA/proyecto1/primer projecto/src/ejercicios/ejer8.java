package ejercicios;

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        /**
         * Es basicamente el ejercicio anterior pero sumandole 1 a la variable
         */
        System.out.println("Ingrese su edad");
        float Edad;
        float Edad2;
        Scanner sc = new Scanner(System.in);
        Edad = sc.nextFloat();
        Edad2 = Edad + 1;
        System.out.println("El siguiente año tendras; "+Edad2);
    }
}
