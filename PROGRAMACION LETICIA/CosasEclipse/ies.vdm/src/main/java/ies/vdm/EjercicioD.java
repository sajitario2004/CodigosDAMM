package ies.vdm;

import java.util.ArrayList;
import java.util.List;

public class EjercicioD {

    public static List<Integer> main(int numero, int digito) {
        List<Integer> posiciones = new ArrayList<>();

        String numeroStr = String.valueOf(Math.abs(numero));
        char digitoChar = (char) ('0' + digito);

        for (int i = 0; i < numeroStr.length(); i++) {
            if (numeroStr.charAt(i) == digitoChar) {
                posiciones.add(i);
            }
        }

        return posiciones;
    }
}

