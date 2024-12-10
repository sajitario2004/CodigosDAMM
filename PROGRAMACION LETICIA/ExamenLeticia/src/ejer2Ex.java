import java.util.Scanner;

public class ejer2Ex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea comprobar si es automorfo: ");
        int num = sc.nextInt();
        /*
        Comprobaremos si el numero introducido por el usuari es negativo
         */
        if(num < 0){
            System.out.println("El numero no puede ser negativo");
        }else {
            /*
            Con la funcion Math.pow elevaremos al cuadrado el numero introducido por el usuario
             */
            int numCuadrado = (int) Math.pow(num, 2);

            /*
            Con el siguiete bucle comprobaremos que modulo le tendremos que hacer al numero para, resumiendo calcularemos
            el numero de cifras que tiene el numero introducido por el usuario
            resumiendo:
             si el usuario introduce 76 o 6 o
             el bucle multiplicara por 10 la variable i asta que tenga tantos 0 como cifras
             de 76 sacara 100  o de 6 sacara 10
             */
            int i = 1;
            while (i < num) {
                i *= 10;
            }

            /*
            Con modulo de las cifras del numero introducido por el usuario a el cuadrado de este mismo sacaremos el numero
            de cifras del cuadrado el cual hemos calculado antes
            resumiendo:
            si el usuario introduce 76 o 6
            Al cuadrado del numero le aremos modulo "i" (antes explicado) para sacarle si es automorfo
            de 76 al cudrado 5776 sacara las ultimas 2 cifras 57-76 o de 6 al cuadrado 36 sacara 3-6
             */
            int cuadradoMOD = numCuadrado % i;

            /*
            Ahora pro ultimo comprobaremos si todos los calculos anteriores son correctos si lo son imprimira lo siguiente
             */
            if (cuadradoMOD == num) {
                System.out.println("El numero " + num + " es automorfo por que digito por el que termina su cuadrado ("
                + numCuadrado + ") es " + cuadradoMOD);
            }else {
                /*
                Si no lo son imprimira lo siguiente
                 */
                System.out.println("El numero " + num + " no es autromorfo por que su cuadrado es "+ numCuadrado + " y no acaba en " + num);
            }
        }
    }
}
