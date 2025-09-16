package ejercicios;

import java.util.Scanner;

public class ejer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int num = sc.nextInt();
        int result = 0;

        String cadenatxt = "";

        for (int i = 0; i != 5; i++) {
            num++;
            cadenatxt = cadenatxt + num ;
            result = num * num;
            cadenatxt += "    " + result;
            result = num * num * num;
            cadenatxt += "    " + result + "\n";

        }
        System.out.println(cadenatxt);

    }
}
