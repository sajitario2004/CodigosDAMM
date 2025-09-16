//

package ejers;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Pedimos las variables al usuario
         */
        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();


        /*
        Comprobamos que ninguno de los 2 numeros introducidos por el usuario es negativo
         */
        if (num1 > 0 && num2 > 0) {

            int i = num1 -1 ;
            String cadena1 = "";

            /*
            Declaramos el primer bucle para sacar todos los divisores del primer numero y como si o si para calcular
            el maximo como un divisor hay que sacar el de los 2 el orden de mayor a menor de los numero que introduzca el
            usuario dara igual porque con este primer bucle solo sacaremos los divisores del num1
             */
            while ( i > 0) {
                if (num1 % i == 0) {

                    /*
                    Dentro del bucle anterior y su comprobacion si son o no divisores comprobaremos si esos mismos divisores
                    son tambien divisores del num2 con otro if
                     */

                    if (num2 % i == 0) {
                        /*
                        Una vez saquemos todos los divisores de los 2 numeros los almacenaremos en una variable tipoString
                        */
                        cadena1 +=  i;
                        }

                }
                i--;
            }
            /*
            ahora que tenemos almacenadas todos los divisores en la variable en una cadena1 so tendremos que sacar el primer
            numero que almaceno en cadena 1
             */
            char cadena2 = (cadena1.charAt(0));

            System.out.println(cadena2);

        }else {
            System.out.println("El numero es negativo o 0 no tiene divisores");
        }

    }
}
