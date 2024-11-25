import java.util.Scanner;
public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo: ");
        int base = sc.nextInt();
        System.out.println("Ingrese la altura del triangulo: ");
        int altura = sc.nextInt();

        boolean comprobNum = base > 0 && altura > 0;

        if (comprobNum) {
            int area = base * altura / 2;
        }

    }
}