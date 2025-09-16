package ejercicios;

import java.util.Scanner;

public class ejer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int num = sc.nextInt();
        int num_mod= num%2;
        boolean num_resultado = num_mod==0 ? true : false;
        String mensaje = num_resultado?"es par":"es impar";
        System.out.println(mensaje);
    }
}
