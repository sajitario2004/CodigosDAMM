import java.util.Scanner;

public class ejer1Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el numero que desea comprobar");
        int numPerf = scanner.nextInt();
        int numComprob = 0;
        String divisores = "";
        /*
        Comprobaremos si el usuario introduce un numero negativo
         */
        if (numPerf < 0) {
            System.out.println("El numero que desea comprobar es negativo");
        }else {
            /*
            Con un bucle for iremos comprobando los divisores de el numero introducido asignandole a "i" el
            valor introducido por teclado y restandole 1 cada vez que se repita el bucle asta llegar a 0
             */
            for (int i = numPerf; i != 0; i--) {
                /*
                Con el siguiente if descartaremos el numero introducido por el usuario como divisor, tipo si el usuario
                introduce 6 que 6 no cuente como divisor de si mismo
                 */
                if(i != numPerf) {
                    /*
                    Mediante modulo iremos comprobando si es divisible por que si un numero dividido otro da resto 0
                    significa que es uno de sus divisores
                     */
                    if (numPerf % i == 0) {
                        /*
                        EL las siguiente variable iremos sumando todos los divisores del numero introducido menos el mismo
                         */
                        numComprob += i;
                        /*
                        y en la siguiente la utilizaremos para mostrarle al usuario por pantalla los divisores del numero
                        introducido
                         */
                        divisores += ", " + i;
                    }
                }
            }


            /*
            En el siguiente if es cuando comnprobaremos si el numero introducido por el usuario es igual al la suma de
            todos sus divisores (sin contar el mismo)
             */
            if (numPerf == numComprob) {
                System.out.println("El numero introducido es perfecto por que sus divisores suman " + numPerf +" y sus divisores son" + divisores);
            }else {
                /*
                Si no tambien le diremos al usuario que su numero no es perfecto
                 */
                System.out.println("El numero introducido no es perfecto por que sus divisores suman " + numComprob + "\ny el numero introducido es " + numPerf + " y sus divisores son" + divisores);
            }
        }
    }
}
