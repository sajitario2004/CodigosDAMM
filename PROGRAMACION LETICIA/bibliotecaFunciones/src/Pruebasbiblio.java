import java.util.Scanner;

public class Pruebasbiblio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int numero = sc.nextInt();
        System.out.println(biblioFunNacho.digitos(numero));
        System.out.println("Ahora introduzca el digito que desea sacar");
        int digito = sc.nextInt();
        int resultado = biblioFunNacho.pegaPorDelante(numero, digito);
        System.out.println(resultado);
    }

}
