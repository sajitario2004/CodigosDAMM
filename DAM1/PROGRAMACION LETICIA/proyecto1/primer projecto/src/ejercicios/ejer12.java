package ejercicios;

import java.util.Scanner;

public class ejer12 {
    public static void main(String[] args) {
        /**
         * Es una regla de tres simple la cual
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        float radio = sc.nextFloat();
        final float PI = 3.14f;
        float Longitud = PI * radio*2;
        float Area = PI*(radio * radio);
        System.out.println("La longitud es: "+Longitud);
        System.out.println("El area es: "+Area);

    }
}
