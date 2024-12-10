import java.util.Scanner;
//alguno comentarios me los autocompletaba intelli con un plugin que he hestado probando son todos quellos que lleva
// la doble barra despues de la variable tipo (variable hace algo )//la variable hace algo

public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //hacemos un bucle infinito
        while (true) {
            System.out.print("Introduce un número (o escribe 'salir' para terminar): ");
            String strDato = sc.nextLine();

            //Cuando el usuario introduzca 'salir', salimos del bucle
            if (esSalir(strDato)) { // Comparación manual para "salir"
                break;
            }

            try {
                //tranformamos el string en un entero
                int valor = convertirAEntero(strDato); // Conversión manual
                try {
                    // Si el número es positivo imprimimos su valor
                    imprimePositivo(valor);
                } catch (Exception e) {
                    //si no lanzamos una excepción la cual imprimira el mensjae que hemos mandado por el throw en la variable
                    System.out.println("Excepción en imprimePositivo: " + e.getMessage());
                }

                try {
                    //Lo mismo de arriba pero con numeros negativos
                    imprimeNegativo(valor);
                } catch (Exception e) {
                    System.out.println("Excepción en imprimeNegativo: " + e.getMessage());
                }
            } catch (Exception e) {
                //si el usuairio por lo que sea no introduce ni negativo ni normal le imprimiremos un error
                System.out.println("Error ");
            }finally {
                //limpiamos el bufffer como en todos los ejercicios anteriores
                sc.nextLine();
            }
        }

    }

    //funcion para comprobar si el usuario introduce "salir"
    //nota: seño no me acuerdo de como se utilizaba el toUpperCase() ais que no lo he utilizado
    public static boolean esSalir(String input) {
        return input.equals("salir") || input.equals("SALIR") || input.equals("Salir");
    }

    //convertimos el numero de un string a un entero con asci, he tendio que meterme varias veces al man asci por que no acordaba de donde estavan los numeros
    //asta que me di cuenta que me imprimia 49 cuando el numero era uno entonces solo le reste 48 para dejarlo como un numero noraml
    public static int convertirAEntero(String input) throws Exception {
        int numero = 0;
        boolean esNegativo = false;

        if (input.charAt(0) == '-') {
            esNegativo = true;
            //busque una opcion que me quitara el caracter de la izquierda por si el usuario introduce negativo le quitare el "-"
            input = input.substring(1);
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int valor = (int) c; // Obtener el valor ASCI del carácter

            //validar que el carácter esté entre '0' (48) y '9' (57)
            if (valor < 48 || valor > 57) {
                throw new Exception("La entrada contiene caracteres no válidos.");
            }

            // construir el número utilizando los valores ASCI
            numero = numero * 10 + (valor - 48); // 48 es el valor ASCII de '0'
        }

        if (esNegativo) {
            return -numero; //si el número es negativo lo convertimos a negativo al final
        }else {
            return numero; //si el número es positivo lo enviamos normal
        }


    }

    //funcion para imprimir un numero positivo si el numero es negativo lanza una excepcion con un mensaje personalizado
    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("\nEl valor es negativo, no se puede imprimir en imprimePositivo. (pulse intro para continuar)");
        }
        System.out.println("imprimePositivo: " + p);
    }
    //funcion para imprimir un numero negativo si el numero es positivo lanza una excepcion con un mensaje personalizado
    public static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("\nEl valor es positivo o cero, no se puede imprimir en imprimeNegativo. (pulse intro para continuar)");
        }
        System.out.println("imprimeNegativo: " + n);
    }
}
