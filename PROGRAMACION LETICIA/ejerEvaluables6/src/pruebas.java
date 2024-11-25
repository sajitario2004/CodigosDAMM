import java.util.Arrays;
import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de arrays que quiere comprobar"+
                "\n1. array de bucle de numero random"+
                "\n2. array de bucle de numeros"+
                "\n3. array de bucle de numeros"+
                "\n4. array de bucle de numeros"+
                "\n5. array de bucle de numeros");
        int seleccion = sc.nextInt();
        if (seleccion == 1) {
            int[] a = new int[10];
            int suma = 0;
            for (int i = 0; i < a.length; i++) {
                int num = (int) (Math.random() * 100 + 1);
                a[i] = num;
            }
            //Suma todos los elementos
            for (int i = 0; i < a.length; i++) {
                suma = suma + a[i];
            }
            //Mostrar suma
            System.out.println(Arrays.toString(a));
            System.out.println("La suma de todo es: " + suma);
            sc.close();
        }else if (seleccion == 2) {
            main2();
        }else if (seleccion == 3) {}
    }

    public static void main2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el tamaño del array");
        int tam = sc.nextInt();
        int[] a = new int[tam];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
        sc.close();
    }
    //Arrays.binarySearch solo sirve para buscar arrays ordenado
    /*
    int a[]
    */
    public static void main3() {

    }
}
