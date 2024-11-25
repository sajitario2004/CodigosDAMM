package ejers;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero que deseea pasar a binario");
        int num = sc.nextInt();

        /*
        hacemos una variable que nos ayudara a calcular cada cifra del numero binario mas tarde
         */
        int numEntero = 0;

        /*
        creamos una cadena
         */
        int cadena = 0 ;

        /*
        creamos 2 variables, una para el binario que sacaremos con las divisiones(Este estara al reves) y otra para
        darle la vuelta
         */
        String bin = "";
        String binTrue = "";

        /*
        Comprovaremos que el numero no es negativo
         */
        if (num > 0 ) {
            int i = num ;

            /*
            con el siguiente bucle iremos sacando con cada repeticion de este una cifra del numero binario
             */
            while (i != 0) {
                numEntero = num % 2;
                num = num / 2;
                i = num;
                bin += numEntero;
                numEntero = 0;
            }

            /*
            segun le asignaremos a cadena el numero de cifras que tiene nuestro numero binario
             */
            cadena = bin.length() -1 ;

            /*
            en funcion al numero anterior repetiremos el siguiente bucle que ara que almacenemos en otra variable el
            numero de manera correcta y le ira almacenando a la inversa
             */
            while (cadena > - 1  ){
                binTrue += bin.charAt(cadena);
                cadena --;
            }
            System.out.println(binTrue);


        }else {
            System.out.println("El numero es negativo");
        }


    }
}
