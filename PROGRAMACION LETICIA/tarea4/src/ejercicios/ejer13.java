package ejercicios;

import java.util.Scanner;

public class ejer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su primera nota: ");
        int nota = sc.nextInt();
        if (nota > 0 && nota <= 10) {
            int Suspenso = 0;

            if (nota < 5) {
                Suspenso++;
            }

            for (int i = 1; i != 6; i++) {

                System.out.println("Ingrese su siguiente nota: ");
                nota = sc.nextInt();

                if (nota < 5) {
                    Suspenso++;
                }


            }
            if (Suspenso > 0) {
                System.out.println("Suspenso hay um total de " + Suspenso + " notas");
            }else if (Suspenso == 0) {
                System.out.println("No hay ningun suspenso");
            }

        }else {
            System.out.println("El nota no es valido");
        }
    }
}
