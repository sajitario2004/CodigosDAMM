package ejercicios;

import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Numero al que desea llegar: ");
        int numero = sc.nextInt();

        for (int conteo = 1;numero  >= conteo;conteo++ ) {
            System.out.println(conteo);
        }
    }
}
