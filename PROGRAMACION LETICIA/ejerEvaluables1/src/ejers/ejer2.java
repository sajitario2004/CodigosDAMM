package ejers;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero en binario");
        int binario = sc.nextInt();

        if (binario > 0) {
        /*
        Es muy parecido al ejercicio anterio, crearemos las variables para primero darle la vuelta al numero y luego
        iremos multiplicando con la siguiente variable
         */
            int numEntero = 0;
            int cadena = 0;

        /*
        Crearemos un buleano para comprobar si el numero introducido no es binario
         */
            boolean nonbin = false;

        /*
        crearemos 2 cadenas de texto una para darle la vuelta al binario y otra para ir sacando los valores de la cadena
         */
            String binStr = binario + "";
            String binStrRevers = "";
            String binStrRevers2 = "";

        /*
        le daremos la vuelta al numero binario cogiendo el numero de caracteres que tiene y luego almacenandolo en la
        varaible de binStrRevers
         */
            cadena = binStr.length() - 1;
            while (cadena > -1) {
                binStrRevers += binStr.charAt(cadena);
                cadena--;
            }

        /*
        ahora igual que antes sacaremos el numero de caracteres que tiene primero
         */
            cadena = binStr.length() - 1;

        /*
        y ahora crearemos un bucle que ira comprobando caracter a caracter si el que esta un esa posicion es 0 o 1
         */
            while (cadena > -1) {
                binStrRevers2 += binStrRevers.charAt(cadena);

            /*
            con este if esto a parte de comprobandolo estoy almacenandolo 2 elevado al numero en funcion de que caracter
            estemos evaluando para sumarlo a una variable tipo numero, por ejemplo si el caracte es el caracter 0
            y este es 1 pues aremos 2 elevado a 0 y asi con el resto.
             */
                if (binStrRevers2.equals("1")) {
                    numEntero += (int) Math.pow(2, cadena);
                }

            /*
            Con el siguiente if comprobaremos si el numero introducido por el usuario es binario o no en caso de que
            tenga alguna cifra que no es binaria declarara la variable boolean nonbin como true
             */
                if (!binStrRevers2.equals("1") && !binStrRevers2.equals("0")) {
                    nonbin = true;
                }

            /*
            dejaremos la varible que que estara con el caracter por el que vallamos de el numero binario vacio
             */
                binStrRevers2 = "";
                cadena--;
            }


            if (nonbin) {
                System.out.println("El numero introducido no es binario friki");
            } else {
                System.out.println(numEntero);
            }
        }else {
            System.out.println("El numero introducido no es positivo");
        }
    }
}
