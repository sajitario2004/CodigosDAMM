package ejercicios;

import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num = sc.nextInt();
        int resultado = num ;
        int factorial = num;
        for (int i = 1; i != num; i++) {
            factorial--;
            resultado *= factorial;
        }
        System.out.println("El resultado del numero factorizado es: " + resultado);
    }
}
