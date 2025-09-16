package ejercicios;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {

        final float Factor_Conversion=166.386F;

        Scanner sc = new Scanner(System.in);
        System.out.println("Combirtamos euros a pesetas");
        System.out.print("Ingrese el numero de euros que quieres convertir: ");
        float euros = sc.nextInt();
        float resultado=euros*Factor_Conversion;
        System.out.println("El resultado en peseta es: "+resultado);

    }
}
