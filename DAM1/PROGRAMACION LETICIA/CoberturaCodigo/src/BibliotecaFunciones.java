public class BibliotecaFunciones {
    public static int decimalABinario(int num) {
        String binario = "";
        while (num > 0) {
            int resto = (num % 2);
            binario = resto + binario;
            num /= 2;
        }

        return Integer.valueOf(binario);

    }
    /**
     *
     * @param num
     * @return
     */
    public static String decimalAHexadecimal(int num) {
        String caracter = "0123456789ABCDEF";
        String hexa = "";
        while (num > 0) {

            hexa = caracter.charAt(num % 16) + hexa;
            num = num / 16;

        }

        return hexa;

    }
    /**
     *
     * @param num
     * @return
     */
    public static int decimalAOctal(int num) {
        String numoctal = "";
        int div = num;
        int resto = 0;

        for (int i = 0; div > 0; i++) {
            resto = div % 8;
            div = div / 8;
            numoctal = resto + numoctal;

        }
        return Integer.valueOf(numoctal);

    }
}