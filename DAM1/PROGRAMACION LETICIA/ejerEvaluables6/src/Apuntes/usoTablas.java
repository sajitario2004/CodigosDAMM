package Apuntes;

import java.util.Arrays;
import java.util.Scanner;

    public class usoTablas {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la prueba que desea hacer: " +
                "\n 1-Rellenar todos los espacios de un array con el mismo valor " +
                "\n 2-Mostrar valores de distinta manera por pantalla " +
                "\n 3-Acceso a la misma tabla reservada desde distintas variables" +
                "\n 4-(null) y su uso ");
        int n = sc.nextInt();
        if (n == 1) {
            try {
                System.out.println("");
                main1();
            } catch (Exception e) {
                System.out.println("" +
                        "\n Error ha introducido un valor invalido");
            }
        } else if (n == 2) {
            try {
                System.out.println("");
                main2();
            } catch (Exception e) {
                System.out.println("" +
                        "\n Error ha introducido un valor invalido");
            }
        } else if (n == 3) {
            try {
                System.out.println("");
                main3();
            } catch (Exception e) {
                System.out.println("" +
                        "\n Error ha introducido un valor invalido");
            }
        } else if (n == 4) {
            try {
                System.out.println("");
                main4();
            } catch (Exception e) {
                System.out.println("" +
                        "\n Error ha introducido un valor invalido");
            }
        }
        sc.close();
    }
    public static void main1() {
        int valores[];
        valores = new int[6];

        Arrays.fill(valores, 14);//ahora al array que apunta a los valores
        /*
        Ahora to valores tiene todas sus posiciones (las 6 posiciones como 14)
         */
        System.out.println(Arrays.toString(valores));

    }
    public static void main2() {
        int notas[] = {0, 9, 15, -6};

        /*
        forma 1 de mostrar los datos por pantalla (es la mas utilizada para mostrar
        todos los datos)
         */
        System.out.println(Arrays.toString(notas));

        /*
        forma 2 de mostrar datos por pantalla (esta se utilizara para mostra valores sueltos)
         */
        System.out.println(notas[0] + " " + notas[1] + " " + notas[2] + " " + notas[3]);
    }
    public static void main3() {

    }
    public static void main4() {

    }
}

