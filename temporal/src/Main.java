import java.io.*;
import java.util.Scanner;

public class Main {
    /*
    INTRODUCES UN NUMERO Y TE DEVUELVE EL NUMERO DE DIGITOS DE ESE NUMERO
    EXAMPLE:
    12
    DEVUELVE-> TIENE 2 DIGITOS
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dime un numero");
        int num = input.nextInt();
        int contSaltos = 10;
        int respuesta = 0;
        int imprim = contDigit(respuesta, num, contSaltos);
        System.out.println("La respuesta es: " + imprim);
    }

    public static int contDigit(int recursivo, int num, int contSaltos){
        int respuestaTotal = 1;

        if (contSaltos <= num){
            int numModulado = num % contSaltos;
            int numRes = num - numModulado;
            recursivo++;
            if (numRes >= contSaltos){
                contSaltos *= 10;
                 respuesta= contDigit(recursivo, num, contSaltos);
                return respuesta;
            }

            return respuesta;


        }




        return respuestaTotal;
    }


}
