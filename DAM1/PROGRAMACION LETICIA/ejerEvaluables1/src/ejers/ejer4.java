package ejers;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        /*
        Pedimos las variables tipo double para que los numeros puedan tener decimales
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero: ");
        double num = sc.nextDouble();


        /*
        Compruevo si el numero introducido es negativo
         */
        if (num > 0) {

            /*
            Declaramos 2 nuevas variables para almacenar la raiz del numero introducido por el usuario y la truncamos
            asignandole un nuevo tipo de variable tipo int y esta le quitara los decimales(se puede hacer con modulo)
             */
            int numRaizConDecimales = (int) Math.sqrt(num);
            int numRaizNormal =  numRaizConDecimales;

            /*
            Ahora crearemos otra variable que nos servira para comprobar si el numero introducido por el usuario tiene
            una raiz exacta y que tambien nos servira para calcular el resto.
             */
            int RaizElevada = (int) Math.pow(numRaizNormal,2);

            /*
            ahora calcularemos el resto en restando el numero introducido por el usuario menos el cuadrado de la raiz truncada
             */
            int resto = (int) num - RaizElevada;

            /*
            Comprobacion de lo antes explicado de si tiene resto o no
             */
            if (RaizElevada == num) {
                System.out.println("Numero introducido: " + num +"\ny su raiz es: " + numRaizNormal);
            }else {
                System.out.println("Numero introducido: " + num + "\ny su raiz es: " + numRaizNormal + " con resto " + resto + "\ny el cuadrado de la raiz aprox es: " + RaizElevada);
            }

        }else {
            System.out.println("El numero es negativo o 0");
        }
    }
}
