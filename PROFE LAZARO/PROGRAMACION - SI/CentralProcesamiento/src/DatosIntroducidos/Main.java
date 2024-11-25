package DatosIntroducidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Memoria> memorias = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una direccion de memoria \n");
        String direccion = sc.next();
        System.out.println("Introduzca su valor en la memoria \n");
        String mem = sc.next();
        while (!mem.equals("F000")) {
            Memoria memoria = new Memoria(direccion, mem);
            memorias.add(memoria);
            System.out.println("Introduzca su valor en la memoria \n");
            mem = sc.next();
            direccion++;
        }
    }
}