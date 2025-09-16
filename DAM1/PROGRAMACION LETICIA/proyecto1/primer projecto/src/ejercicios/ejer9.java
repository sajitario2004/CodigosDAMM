package ejercicios;

import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el año en el que nacio");
        int ANO_Usuario = sc.nextInt();
        System.out.println("ahora ingrese el año actual");
        int ANO_Actual = sc.nextInt();
        int Edad = ANO_Actual - ANO_Usuario ;
        System.out.println("Tu edad actual es "+Edad);
    }
}
