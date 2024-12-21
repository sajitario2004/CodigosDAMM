public class biblioFunNacho {
    /*
    Seño he aprendido que System.err te imprime las letras pero en rojo como si fuera un error y creo que queda mas profesional

     */
    // 1. esCapicua: Devuelve verdadero si el número es capicúa y falso si no lo es
    public static boolean esCapicua(int num) throws Exception {

            if (num < 0){
                throw  new Exception("no se puede comprobar por que el numero es negativo");
            }

            int original = num;
            int inverso = 0;

            while (num > 0) {
                int digito = num % 10;
                inverso = inverso * 10 + digito;
                num = num / 10;
            }
            return original == inverso;

    }

    // 2. esPrimo: Devuelve verdadero si el número es primo y falso si no lo es
    public static boolean esPrimo(int num) throws Exception {
            if (num <= 1) {
                throw new Exception("el numero primo no puede ser negativo, ni 0, ni 1");
            }

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;

    }

    // 3. siguientePrimo: Devuelve el siguiente primo mayor que el número dado
    public static int siguientePrimo(int num) throws Exception {
        if (num <= 1) {
            throw new Exception("el numero primo no puede ser negativo, ni 0, ni 1");
        }
        int siguiente = num + 1;
            try {
                while (!esPrimo(siguiente)) {
                    siguiente++;
                }
                return siguiente;
            } catch (Exception e) {
                throw new Exception("error ha introducido algo mal");
            }
    }

    // 4. digitos: Cuenta el número de dígitos de un número entero
    public static int digitos(int num) {
            int contador = 0;
            if (num < 0) {
                num *= -1;
            }
            if (num == 0) {
                return 1;
            }
            while (num > 0) {
                num = num / 10;
                contador++;
            }
            return contador;
    }

    // 5. voltea: Devuelve el número invertido
    public static int voltea(int num) {

            int resultado = 0;
            while (num != 0) {
                resultado = resultado * 10 + (num % 10);
                num /= 10;
            }
            return resultado;

    }

    // 6. digitoN: Devuelve el dígito en la posición n (de izquierda a derecha empezando en 0)
    public static int digitoN(int num, int n) throws Exception {

            n-=1;
            if (num < 0) {
                num = -num;
            }
            int numDigitos = digitos(num);
            if (n < 0 || n >= numDigitos) {
                throw new Exception("Posición inválida");
            }
            num /= (int) Math.pow(10, numDigitos - n - 1);

            return num % 10;

    }

    // 7. quitaPorDetras: Quita n dígitos por detrás (derecha) del número
    public static int quitaPorDetras(int num, int n) {

            if (n < 0) {
                throw new IllegalArgumentException("Número de dígitos a quitar no puede ser negativo");
            }
            return num / (int) Math.pow(10, n);


    }

    // 8. quitaPorDelante: Quita n dígitos por delante (izquierda) del número
    public static int quitaPorDelante(int num, int n) {

            int digitos = digitos(num);
            if (n < 0 || n > digitos) {
                throw new IllegalArgumentException("Número de dígitos a quitar no válido");
            }
            digitos -= n;
            return num % (int) Math.pow(10, digitos);

    }

    // 9. pegaPorDetras: Añade un dígito a un número por detrás
    public static int pegaPorDetras(int num, int digito) {

            if (digito > 0 && digito < 10) {
                if (num < 0) {
                    return num * 10 - digito;
                }
                return num * 10 + digito;

            } else {
                throw new IllegalArgumentException("El dígito debe estar entre 0 y 9");
            }


    }

    // 10. pegaPorDelante: Añade un dígito a un número por delante
    public static int pegaPorDelante(int num, int digito) {

            if (digito < 0 || digito > 9) {
                throw new IllegalArgumentException("El dígito debe estar entre 0 y 9");
            }
            if (num < 0) {
                num = -num;
                int digitos = digitos(num);
                digitos = (int) Math.pow(10, digitos);
                digito *= digitos;
                num += digito;
                return -num;

            }else {
                int digitos = digitos(num);
                digitos = (int) Math.pow(10, digitos);
                digito *= digitos;
                return num + digito;
            }

    }
}
