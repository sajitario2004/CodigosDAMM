public class biblioFunNacho {
    // 1. esCapicua: Devuelve verdadero si el número es capicúa y falso si no lo es
    public static boolean esCapicua(int num) {
        /*
        Guardamos el valor original del número
         */
        int original = num;
        /*
        Variable para almacenar el número invertido
        */
        int inverso = 0;

        while (num > 0) {
            /*
            Extraemos el último dígito de num
             */
            int digito = num % 10;

            /*
            Lo agregamos al número inverso
             */
            inverso = inverso * 10 + digito;

            /*
            Quitamos el último dígito de num
             */
            num = num / 10;
        }

        /*
        Comparamos el número original con el número invertido
         */
        return original == inverso;
    }

    // 2. esPrimo: Devuelve verdadero si el número es primo y falso si el numero no es primo
    public static boolean esPrimo(int num) {
        /*
        Aremos una comprobacion de is el numero  es igual o menor que uno para descartar casos del usuario
         */
        if (num <= 1) {
            return false;
        }

        /*
        Si el número es divisible por cualquier otro número no es primo
         */
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        /*
        Si no se encontró ningún divisor es primo
         */
        return true;
    }

    // 3. siguientePrimo: Devuelve el siguiente primo mayor que el número dado
    public static int siguientePrimo(int num) {
        int siguiente = num + 1;
        /*
        Utilizando la funcion 2 comprobaremos cual es el siguiente primo mas cercano sumando de 1 en 1 al numero
        introducido por el usuario en un bucle y mientras no sea primo el bucle continua.
         */
        while (!esPrimo(siguiente)) {
            siguiente++;
        }
        return siguiente;
    }

    // 4. digitos: Cuenta el número de dígitos de un número entero
    public static int digitos(int num) {
        /*
        Variable para contar los dígitos
         */
        int contador = 0;

        /*
        Si el número es negativo lo convertimos a positivo manualmente
         */
        if (num < 0) {
            num *= -1;
        }

        /*
        Si el número es 0 tiene 1 dígito
         */
        if (num == 0) {
            return 1;
        }

        /*
        Mientras el número sea mayor que 0 seguimos dividiéndolo por 10
         */
        while (num > 0) {
            num = num / 10;
            contador++;
        }

        /*
        Devolvemos los digitos que tenga el numero introducido por el usuario
         */
        return contador;
    }

    // 5. voltea: Devuelve el número invertido
    public static int voltea(int num) {
        int resultado = 0;
        /*
        Aremos un bucle que valla multiplicando por 10 el ultimo digito del numero del numero dado y se lo va a
        añadir a la variable resultado
         */
        while (num != 0) {
            resultado = resultado * 10 + (num % 10);
            num /= 10;
        }
        /*
        Devolbemos el numero dado la vuelta
         */
        return resultado;
    }

    // 6. digitoN: Devuelve el dígito en la posición n (de izquierda a derecha empezando en 0)
    public static int digitoN(int num, int n) {
        /*
        Convertir el número a positivo si es negativo
         */
        if (num < 0) {
            num = -num;
        }

        /*
        Contar la cantidad de dígitos en el número
         */
        int numDigitos = digitos(num);

        /*
        Validar si la posición es válida
         */
        if (n < 0 || n >= numDigitos) {
            return -1;
        }

        /*
        Eliminar los primeros "n" dígitos desde la izquierda
         */
        num /= (int) Math.pow(10, numDigitos - n - 1);

        /*
        Devolvemos el último dígito
         */
        return num % 10;
    }



    // 7. quitaPorDetras: Quita n dígitos por detrás (derecha) del número
    public static int quitaPorDetras(int num, int n) {
        /*
        Hacemos una simple division del numero entre 10 elevado al numero de posiciones de la
        derecha que queramos quitar
         */
        int resultado = num / (int) Math.pow(10, n);
        return resultado;
    }

    // 8. quitaPorDelante: Quita n dígitos por delante (izquierda) del número
    public static int quitaPorDelante(int num, int n) {
        /*
        Utilizando recursividad entre funciones aprobecho la funcion de arriba de digitos para sacar el numero de
        digitos que tiene el numero
         */
        int digitos = digitos(num);
        /*
        Restamos a digitos la cantidad de digitos que queremos quitar por la derecha, porejemplo
        que el numero tiene 7 cifras y queremos quitarle 3. le restamos 3 a 7.
         */
        digitos -= n;
        /*
        Ahora nos quedaremos con los digitos que nos de el modulo del numero dividido 10 elevado al numero de digitos
        con los que nos vamos a quedar
         */
        int resultado = num % (int) Math.pow(10, digitos);
        return resultado;
    }

    // 9. pegaPorDetras: Añade un dígito a un número por detrás
    public static int pegaPorDetras(int num, int digito) {
        /*
        Multiplicamos el numero por 10 y le sumamos el digito que quiere añadir el usuario
         */
        return num * 10 + digito;
    }

    // 10. pegaPorDelante: Añade un dígito a un número por delante
    public static int pegaPorDelante(int num, int digito) {
        int digitos = digitos(num);
        digitos = (int) Math.pow(10, digitos);
        digito *= digitos;
        num += digito;
        return  num;

    }


}
