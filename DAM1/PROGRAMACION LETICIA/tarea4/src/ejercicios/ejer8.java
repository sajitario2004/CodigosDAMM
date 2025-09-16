package ejercicios;

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int conteo = 0;

        for (int i = 0; i != 10; i++) {
            System.out.print("Ingrese un numero: ");
            number = sc.nextInt();

            conteo += number;
        }
        int media = conteo / 10;
        System.out.println("La media es: " + media);
    }
}
