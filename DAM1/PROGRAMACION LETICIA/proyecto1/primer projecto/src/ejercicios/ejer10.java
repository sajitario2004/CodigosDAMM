package ejercicios;

import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        /**
         * Explicacion los valores minimos y maximos de short son entre
         * 32767 y -32768  lo que he hecho es sumar 1 al valor maximo de
         * short para que vuelva al valor minimo que puede ofrecer o al menos
         * eso he entendido.
         */
        short a=32767;
        System.out.println("El valor maximo es "+a);
        a++;
        System.out.println("El valor minimo es "+a);

    }
}
