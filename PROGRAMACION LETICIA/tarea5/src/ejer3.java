import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int num = sc.nextInt();
        String respuesta = numPrimos(num);
    }

    private static String numPrimos (int num) {
        String cadena = "los divisores de " + num + " son";

        if (num > 0) {


            int primo = 0;
            int j = 0;

            for (int i = num ; i > 0; i-- ) {

                j = i;

                if (num % i == 0) {

                    while (j != 0) {

                        if (i % j == 0) {
                            primo += j;
                        }

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
        return cadena;
    }
}
