package Colecciones.ejer1NoEvaluables.ejer2;

import java.util.*;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listaNum = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            listaNum.add(num);
        }

        Collections.sort(listaNum);

        System.out.println(listaNum);
    }
}
