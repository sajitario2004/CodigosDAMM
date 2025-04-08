package Colecciones.ejer1.ejer3;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class  principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listaPalabras = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese una palabra: ");
            String palabra = sc.nextLine();
            listaPalabras.add(palabra);
        }

        Collections.sort(listaPalabras);
        System.out.println(listaPalabras);

    }
}
