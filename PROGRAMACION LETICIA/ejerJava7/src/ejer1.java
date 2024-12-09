import java.util.Scanner;
//he intiendado el 1 sin la excepcion esa rara de InputMismatchException no se lo que hace asi que lo he hecho sin ella

public class ejer1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un valor entero: ");
            int a = sc.nextInt();
            System.out.println("Valor introducido: " + a);
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Valor introducido incorrecto");
        } finally {
            sc.close();
        }
    }
}