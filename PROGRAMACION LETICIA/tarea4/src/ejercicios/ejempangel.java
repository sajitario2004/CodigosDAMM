package ejercicios;

import java.util.Scanner;

public class ejempangel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese el numero de veces que le va a sumar 1");
        int veces = sc.nextInt();

        int resultado = num;

        /*
        while (veces > 0) {
            resultado += 1 ;
            veces--;
        }
         */



        for (int contado = 0; contado < veces; contado++) {
            resultado += 1 ;
        }
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
