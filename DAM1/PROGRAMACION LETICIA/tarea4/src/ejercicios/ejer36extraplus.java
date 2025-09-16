package ejercicios;

import java.util.Scanner;

public class ejer36extraplus {
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


            int primo = 0;
            int j = 0;

            for (int i = num ; i > 0; i-- ) {

                j = i;


                if (num % i == 0) {

                    while (j != 0) {

                        if (i % j == 0) {
                            primo += j;
                        }
                        System.out.println(primo);
                        j--;

                    }

                    boolean prueba = primo == i + 1 ;


                    if (prueba) {
                        cadena += " " + i;
                    }
                    primo = 0;
                }
            }
            System.out.println(cadena + " y 1");

        }else {
            System.out.println("El numero es negativo o 0 no tiene divisores");
        }
    }
}

