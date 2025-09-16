package ejercicios;

import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {

        final float Factor_Conversion=166.386F;

        Scanner sc = new Scanner(System.in);
        System.out.println("Combirtamos pesetas a euros");
        System.out.print("Ingrese el numero de pesetas que quieres convertir: ");
        float pesetas = sc.nextInt();
        float resultado=pesetas/Factor_Conversion;
        System.out.println("El resultado en euros es: "+resultado);

    }
}
