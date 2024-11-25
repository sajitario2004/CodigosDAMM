import java.util.Scanner;

public class ejer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduzca un numero: ");
        int num1 = sc.nextInt();
        int ultimoDigito = num1 % 10;
        System.out.println("El ultimo digito del numero es: " + ultimoDigito);

    }
}
