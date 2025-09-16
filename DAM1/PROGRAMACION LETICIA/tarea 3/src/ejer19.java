import java.util.Scanner;

public class ejer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int c = sc.nextInt();
            boolean rectangulototal1 = a == Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
            boolean rectangulototal2 = b == Math.sqrt(Math.pow(c, 2) + Math.pow(a, 2));
            boolean rectangulototal3 = c == Math.sqrt(Math.pow(b, 2) + Math.pow(a, 2));
        if (rectangulototal1 || rectangulototal2 || rectangulototal3) {
            System.out.println("Es un triangulo rectangulo");
        }else {
            if ( a == b && b== c ) {
                System.out.println("Es un triangulo equilatero");
            }else if ((a == c && b != a) || (a == b && b != c) || ( b == c && a != b)) {
                System.out.println("Es un triangulo isosceles");
            }else if (a != c && a != b && b != c) {
                System.out.println("Es un triangulo escaleno");
            }
        }
    }
}
