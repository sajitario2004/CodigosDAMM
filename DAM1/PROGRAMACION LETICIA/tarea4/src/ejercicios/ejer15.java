package ejercicios;

import java.util.Scanner;

public class ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos que va a tener el lado de su triangulo");
        int num = sc.nextInt();
        int contador = 1;

        String triangulo = "*";


        for (int i = 0 ; i < num ;) {

            while (contador < num) {
                triangulo += "*";
                contador++;

            }
            System.out.println(triangulo);

            triangulo = "*";

            num--;
            contador = 1;

        }

        // aafasjhd = afasjdhf + 11635164
        // a += 1
        //



    }
}
