package ies.vdm;

import java.util.Arrays;
import java.util.List;

public class EjercicioC {

    public static String main(List<Integer> numeros) {
        int contador = 0;
        int sumaImpares = 0;
        int contadorImpares = 0;
        int mayorPar = Integer.MIN_VALUE;

        for (int numero : numeros) {
            if (numero < 0) {
                break;
            }

            contador++;

            if (numero % 2 == 0) {
                if (numero > mayorPar) {
                    mayorPar = numero;
                }
            } else {
                sumaImpares += numero;
                contadorImpares++;
            }
        }

        String resultado = "Has introducido " + contador + " números.\n";

        if (contadorImpares > 0) {
            double media = (double) sumaImpares / contadorImpares;
            // Mostrar con solo 2 decimales de forma básica (truco multiplicar/truncar)
            double mediaRedondeada = Math.round(media * 100.0) / 100.0;
            resultado = resultado + "La media de los impares es: " + mediaRedondeada + "\n";
        } else {
            resultado = resultado + "No se introdujeron números impares.\n";
        }

        if (mayorPar != Integer.MIN_VALUE) {
            resultado = resultado + "El mayor de los pares es: " + mayorPar;
        } else {
            resultado = resultado + "No se introdujeron números pares.";
        }

        return resultado;
    }

    public static void Main(String[] args) {
        List<Integer> numeros = Arrays.asList(3, 8, 5, 2, 7, -1);
        String resultado = main(numeros);
        System.out.println(resultado);
    }
}
