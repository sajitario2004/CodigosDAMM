package ejercicios;

import java.util.Scanner;

public class ejer35extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int num = sc.nextInt();
        /*
         * una vez le pidamos al usuario el numero comprobamos con un if si el numero introducido por el usuario es negativo
         */
        if (num > 0) {

            /*
             * La siguiente cadena de texto la utilizaremos para darle al usuario por pantalla  y concatenar los divisores de ese numero
             */

            String cadena = "los divisores de " + num + " son";

            /*
             * Ahora una vez tengamos todos los datos le daremos el valor introducido por el usuario a una variable para a esa variable mediante
             * un bucle for le iremos restando de 1 en 1 para que luego dentro del bucle valla comprobando con un if si el numero modulo esa variable
             * da 0 por que si diera un resto significa que no es divisible.
             */
            for (int i = num; i > 0; i--) {


                if (num % i == 0) {
                    cadena += " " + i;
                }
            }
            System.out.println(cadena);

        }else {
            System.out.println("El numero es negativo o 0 no tiene divisores");
        }
    }
}
