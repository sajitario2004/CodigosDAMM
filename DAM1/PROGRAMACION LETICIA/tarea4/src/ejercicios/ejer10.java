package ejercicios;

import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num = 0;
        int conteo = 1;
        int sumaTodo = 0;
        String cadenaTexto = "Los numero impares son";

        for (int i = 0; conteo != 11 ; i++) {

            if (num % 2 != 0) {
                System.out.println(cadenaTexto + " " +num);
                conteo++;
                sumaTodo += num;
            }
            num++;
        }
        System.out.println("La suma de todo es "+sumaTodo);
    }
}
