package ejercicios;

import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num = sc.nextInt();
        int numElevado = num * 10;
        int variableGuardada = num ;
        if (num <= 10 && num > 0) {
            for (int i = 1; i != 11; i++) {
                System.out.println(num);
                num += variableGuardada;
            }
        }
    }
}
