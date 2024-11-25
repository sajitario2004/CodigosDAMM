import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanta comida compras diariamente: ");
        int comidantaria = sc.nextInt();
        System.out.println("Cuantos animales tienes: ");
        int numanimales = sc.nextInt();
        System.out.println("Cuanto comen los animales al dia: ");
        int kilosporAnimales = sc.nextInt();

        boolean comprobacion = (numanimales * kilosporAnimales) > comidantaria;

        if (comprobacion) {
            int parteKilosAnimales = kilosporAnimales / numanimales;
            System.out.println("Tocara a " + parteKilosAnimales + " kilos por animal.");
        } else {
            System.out.println("No as comprado comida suficiente");
        }

    }
}
