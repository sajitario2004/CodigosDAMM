public class biblioFunNacho {
    /*
    Seño he aprendido que System.err te imprime las letras pero en rojo como si fuera un error y creo que queda mas profesional

     */
    // 1. esCapicua: Devuelve verdadero si el número es capicúa y falso si no lo es
    public static boolean esCapicua(int num) {
        try {
            int original = num;
            int inverso = 0;

            while (num > 0) {
                int digito = num % 10;
                inverso = inverso * 10 + digito;
                num = num / 10;
            }
            return original == inverso;
        } catch (Exception e) {
            System.err.println("Error en esCapicua: " + e.getMessage());
            return false;
        }
    }

    // 2. esPrimo: Devuelve verdadero si el número es primo y falso si no lo es
    public static boolean esPrimo(int num) {
        try {
            if (num <= 1) {
                return false;
            }

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            System.err.println("Error en esPrimo: " + e.getMessage());
            return false;
        }
    }

    // 3. siguientePrimo: Devuelve el siguiente primo mayor que el número dado
    public static int siguientePrimo(int num) {
        try {
            int siguiente = num + 1;
            while (!esPrimo(siguiente)) {
                siguiente++;
            }
            return siguiente;
        } catch (Exception e) {
            System.err.println("Error en siguientePrimo: " + e.getMessage());
            return -1;
        }
    }

    // 4. digitos: Cuenta el número de dígitos de un número entero
    public static int digitos(int num) {
        try {
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
        } catch (Exception e) {
            System.err.println("Error en digitos: " + e.getMessage());
            return -1;
        }
    }

    // 5. voltea: Devuelve el número invertido
    public static int voltea(int num) {
        try {
            int resultado = 0;
            while (num != 0) {
                resultado = resultado * 10 + (num % 10);
                num /= 10;
            }
            return resultado;
        } catch (Exception e) {
            System.err.println("Error en voltea: " + e.getMessage());
            return 0;
        }
    }

    // 6. digitoN: Devuelve el dígito en la posición n (de izquierda a derecha empezando en 0)
    public static int digitoN(int num, int n) {
        try {
            n-=1;
            if (num < 0) {
                num = -num;
            }
            int numDigitos = digitos(num);
            if (n < 0 || n >= numDigitos) {
                throw new IllegalArgumentException("Posición inválida");
            }
            num /= (int) Math.pow(10, numDigitos - n - 1);
            return num % 10;
        } catch (IllegalArgumentException e) {
            System.err.println("Error en digitoN: " + e.getMessage());
            return -1;
        } catch (Exception e) {
            System.err.println("Error inesperado en digitoN: " + e.getMessage());
            return -1;
        }
    }

    // 7. quitaPorDetras: Quita n dígitos por detrás (derecha) del número
    public static int quitaPorDetras(int num, int n) {
        try {
            if (n < 0) {
                throw new IllegalArgumentException("Número de dígitos a quitar no puede ser negativo");
            }
            return num / (int) Math.pow(10, n);
        } catch (IllegalArgumentException e) {
            System.err.println("Error en quitaPorDetras: " + e.getMessage());
            return 0;
        } catch (Exception e) {
            System.err.println("Error inesperado en quitaPorDetras: " + e.getMessage());
            return 0;
        }
    }

    // 8. quitaPorDelante: Quita n dígitos por delante (izquierda) del número
    public static int quitaPorDelante(int num, int n) {
        try {
            int digitos = digitos(num);
            if (n < 0 || n > digitos) {
                throw new IllegalArgumentException("Número de dígitos a quitar no válido");
            }
            digitos -= n;
            return num % (int) Math.pow(10, digitos);
        } catch (IllegalArgumentException e) {
            System.err.println("Error en quitaPorDelante: " + e.getMessage());
            return 0;
        } catch (Exception e) {
            System.err.println("Error inesperado en quitaPorDelante: " + e.getMessage());
            return 0;
        }
    }

    // 9. pegaPorDetras: Añade un dígito a un número por detrás
    public static int pegaPorDetras(int num, int digito) {
        try {
            if (digito > 0 && digito < 10) {
                if (num < 0) {
                    return num * 10 - digito;
                }
                return num * 10 + digito;

            } else {
                throw new IllegalArgumentException("El dígito debe estar entre 0 y 9");
            }


        } catch (IllegalArgumentException e) {
            System.err.println("Error en pegaPorDetras: " + e.getMessage());
            return num;

        } catch (Exception e) {
            System.err.println("Error inesperado en pegaPorDetras: " + e.getMessage());
            return num;

        }
    }

    // 10. pegaPorDelante: Añade un dígito a un número por delante
    public static int pegaPorDelante(int num, int digito) {
        try {
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
        } catch (IllegalArgumentException e) {
            System.err.println("Error en pegaPorDelante: " + e.getMessage());
            return num;
        } catch (Exception e) {
            System.err.println("Error inesperado en pegaPorDelante: " + e.getMessage());
            return num;
        }
    }
}
