package ejercicios;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura en cm de su arbol: ");
        int altura = sc.nextInt();
        int num = 0;
        while (altura != -1) {

            if (num < altura ){
                num = altura;
            }

            System.out.println("Ingrese la altura de otro arbol: ");
            altura = sc.nextInt();

        }

        if (num == 0) {
            System.out.println("A introducido un -1 en la altura de su primer arbol, ha ocurrido un error");
        }else {
            System.out.println("La altura del arbol mas alto es: " + num);
        }
    }
}
