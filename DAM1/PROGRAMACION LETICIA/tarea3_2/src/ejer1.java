import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de entre 0000 y 9999 y le dire si es capicuo: ");

        /*
        * Primero voy a dividir el numero en 4 por secciones
        * */
        int num1 = sc.nextInt();

        int num2 = num1 % 1000;
        int digit4 = (num1 - (num2)) / 1000;

        int num3 = num2 % 100;
        int digit3 = (num2 - (num3)) / 100;

        int num4 = num3 % 10;
        int digit2 = (num3 - (num4)) / 10;


        int digit1 = num4;

        /*
        *Esto solo lo hice para saber si las segmentaciones eran correctas
        *System.out.println(digit4);
        *System.out.println(digit3);
        *System.out.println(digit2);
        *System.out.println(digit1);
        **/


        /*
        *Ahora procedere con los buleanos para saber cuantos digitos tiene el numero
        */

        boolean comprob4digit =  0 < digit4;
        boolean comprob3digit = digit4 == 0 && digit3 != 0;
        boolean comprob2digit = digit4 == 0 && digit3 == 0 && digit2 != 0;
        boolean comprob1digit = digit4 == 0 &&  digit3 == 0 &&  digit2 == 0 && digit1 != 0;
        boolean specialcase0 = digit1 == 0 && digit2 == 0 &&digit3 == 0 && digit4 == 0;

        /*
        *Voy a crear variables tipo String para que le diga al usuario si es capicuo o no
         */

        String capicuo = ("El numero es capicuo");
        String capicuoNot = ("El numero es no capicuo");

        /*
        *Ahora por ultimo con if voy a comprobar primero los digitos del numero y luego si es capicuo
         */

        if (comprob4digit) {
            if (digit4 == digit1 && digit3 == digit2) {
                System.out.println(capicuo);
            }else {
                System.out.println(capicuoNot);
            }
        }else if (comprob3digit) {
            if (digit3 == digit1) {
                System.out.println(capicuo);
            }else {
                System.out.println(capicuoNot);
            }
        }else if (comprob2digit) {
            if (digit2 == digit1) {
                System.out.println(capicuo);
            }else {
                System.out.println(capicuoNot);
            }
        }
        if (comprob1digit) {
            System.out.println("claro que es capicuo si es de un solo digito");
        }
        if (specialcase0) {
            System.out.println("has introducido 0 obviamente es capicuo");
        }

    }
}
