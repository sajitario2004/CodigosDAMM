/*
el usuario introducira una frase y esa misma frase cada palabra que sea para se sustituiran todas sus letras por el numero 2
ejemplo :
hola bueno pene
2222 bueno 2222
 */


import java.util.Scanner;


public class ejer1putosNegros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la frase: ");
        String frase = sc.nextLine();

        String resultado = "";
        int i = 0;

        while (i < frase.length()) {
            char caracterSacado = frase.charAt(i);

            if (caracterSacado == ' ') {
                resultado += caracterSacado;
                i++;

            }

            String palabra = "";

            while (i < frase.length() && frase.charAt(i) != ' ') {
                palabra += frase.charAt(i);
                i++;
            }

            if(palabra.length() % 2 == 0){
                for (int j = 0; j < palabra.length(); j++) {
                    resultado += 2;
                }
            }else{
                resultado += palabra;
            }
        }
        System.out.println("la frase pasa a ser:\n" + resultado);
    }

}
