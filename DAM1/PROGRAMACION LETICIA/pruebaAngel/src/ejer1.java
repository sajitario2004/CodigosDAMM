/*
coge palabra y cuenta el numero de letras si el numero de letras es par lo

hola como estas
2222 2222 estas
 */
import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();

        String resultado = ""; // Variable para almacenar el resultado final
        int i = 0; // Índice para recorrer la frase

        while (i < frase.length()) {
            char caracter = frase.charAt(i);

            if (caracter == ' ') { // Si es un espacio, añadirlo al resultado
                resultado += caracter;
                i++; // Avanzar al siguiente carácter
                continue; // Salto de iteración ya no es necesario
            }

            String palabra = ""; // Variable temporal para construir la palabra

            // Construir la palabra hasta encontrar un espacio o el final de la frase
            while (i < frase.length() && frase.charAt(i) != ' ') {
                palabra += frase.charAt(i);
                i++;
            }

            // Verificar si la longitud de la palabra es par
            if (palabra.length() % 2 == 0) {
                for (int j = 0; j < palabra.length(); j++) {
                    resultado += "2"; // Reemplazar por '2' tantas veces como letras tenga la palabra
                }
            } else {
                resultado += palabra; // Mantener la palabra original si su longitud es impar
            }
        }

        System.out.println("Resultado: " + resultado);
    }
}
