package ejercicios;

import java.util.Scanner;

public class ejer14 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int result = 0;

        for (int i = 1; a != 11; i++ ) {

            result = b * a;

            System.out.println("El resultado de " + b + " * " + a + " es " + result);

            b += 1;

            if (b == 11) {
                b = 1;
                a ++;
            }
        }
    }
}
