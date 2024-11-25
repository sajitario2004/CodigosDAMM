package ejercicios;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabla = 7;
        for (int tablaMulti = 7; tabla <= 100 ; tabla += tablaMulti) {
            System.out.println(tabla);
        }
    }

}
