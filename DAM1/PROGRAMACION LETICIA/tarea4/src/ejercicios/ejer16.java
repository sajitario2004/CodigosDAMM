package ejercicios;

import java.util.Scanner;

public class ejer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la contraseña: ");
        int n = sc.nextInt();
        int conbin = 1435;
        int condi = 0;

        boolean prueba = n > 9999 || n < 0;
        boolean condicion = false;

        if (prueba) {
            for (int i = 1; i < 4;) {
                System.out.println("La contraseña es incorrecta repitala");
                n = sc.nextInt();


                if (n == conbin) {
                    i = 4;
                    condicion = true;
                }
                i++;
            }
        }

        if (n == conbin) {
            System.out.println("la contraseña es correcta");
        }

        if (condicion) {
            System.out.println("has introducido la contraseña demasiado el programa se cerrara");
        }
    }
}
