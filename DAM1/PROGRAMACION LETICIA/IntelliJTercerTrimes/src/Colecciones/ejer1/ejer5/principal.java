package Colecciones.ejer1.ejer5;


import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class principal implements Comparator<Prueba> {
    public static void main(String[] args) {
        // Crear el ArrayList de objetos Prueba
        ArrayList<Prueba> pruebas = new ArrayList<>();
        pruebas.add(new Prueba(2, "hola", "adios"));
        pruebas.add(new Prueba(4, "nacho", "cachondo"));
        pruebas.add(new Prueba(6, "daniel", "cachondo"));
        pruebas.add(new Prueba(1, "petra", "cachondo"));


        Collections.sort(pruebas, new Comparator<Prueba>() {
            @Override
            public int compare(Prueba o1, Prueba o2) {
                return Integer.compare(o1.getHola(), o2.getHola());
            }
        });

        // Imprimir el resultado ordenado
        for (Prueba prueba : pruebas) {
            System.out.println(prueba);
        }

    }

    public int compare(Prueba o1, Prueba o2) {
        if (o1.getHola() > o2.getHola()) {
            return 1;
        }else if (o1.getHola() == o2.getHola()) {
            return 0;
        }else {
            return -1;
        }
    }


}
