import java.util.Scanner;

public class ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota del primer control: ");
        float nota1 = sc.nextInt();
        System.out.println("Nota del segundo control: ");
        float nota2 = sc.nextInt();

       boolean notaFinalBuena = (nota1 + nota2)/ 2 >= 5;
       boolean notaFinalMala = (nota1 + nota2)/ 2 < 5;
       float notaMedia = (nota1 + nota2)/ 2;

        if (notaFinalBuena) {
            System.out.println("Tu nota de programacion es " + notaMedia);
        }
        if (notaFinalMala) {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
            String apto = sc.next();
            String aptoPositivo = "apto";
            boolean aptoFina = aptoPositivo.equals(apto);

            if (aptoFina) {
                System.out.println("Tu nota de programacion es " + 5);
            } else {
                System.out.println("Tu nota de programacion es " + notaMedia);
            }
        }
    }
}
