package ejercicios;

import java.util.Scanner;

public class ejer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num = sc.nextInt();
        int cont = 0;
        int media = 0;
        int result = 0;


        if (num >= 0) {
            while (num >= 0) {

                cont++;
                media += num;

                System.out.println("introduzca otro numero porfavor");
                num = sc.nextInt();
            }
        }
        result = media / cont;
        System.out.println("El numero introducido es negativo se " +
                "\nprocedera con la finalizacion del programa " +
                "\nel resultado de la media es: " + result);





    }
}
