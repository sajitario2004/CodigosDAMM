import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entre 1 y 99: ");
        int numero = scanner.nextInt();

        boolean comproNum1 = numero < 1 || numero > 99;
        boolean comproNum2 = numero < 20 && numero > 0;
        boolean comproNum3 =
                        numero == 20 || numero == 30 ||
                        numero == 40 || numero == 50 || numero == 60 ||
                        numero == 70 || numero == 80 || numero == 90;


        if (comproNum1) {
            System.out.println("Número fuera de rango.");
        } else {
            if (comproNum2) {
                switch (numero) {
                    case 1: System.out.println("UNO");
                    break;
                    case 2: System.out.println("DOS");
                    break;
                    case 3: System.out.println("TRES");
                    break;
                    case 4: System.out.println("CUATRO");
                    break;
                    case 5: System.out.println("CINCO");
                    break;
                    case 6: System.out.println("SEIS");
                    break;
                    case 7: System.out.println("SIETE");
                    break;
                    case 8: System.out.println("OCHO");
                    break;
                    case 9: System.out.println("NUEVE");
                    break;
                    case 10: System.out.println("DIEZ");
                    break;
                    case 11: System.out.println("ONCE");
                    break;
                    case 12: System.out.println("DOCE");
                    break;
                    case 13: System.out.println("TRECE");
                    break;
                    case 14: System.out.println("CATORCE");
                    break;
                    case 15: System.out.println("QUINCE");
                    break;
                    case 16: System.out.println("DIECISIEIS");
                    break;
                    case 17: System.out.println("DIECISIETE");
                    break;
                    case 18: System.out.println("DIECIOCHO");
                    break;
                    case 19: System.out.println("DIECINUEVE");
                    break;
                }
            }else if (comproNum3) {
                switch (numero) {
                    case 20: System.out.println("VEINTE");
                    break;
                    case 30: System.out.println("TREINTA");
                    break;
                    case 40: System.out.println("CUARENTA");
                    break;
                    case 50: System.out.println("CINCUENTA");
                    break;
                    case 60: System.out.println("SESENTA");
                    break;
                    case 70: System.out.println("SETENTA");
                    break;
                    case 80: System.out.println("OCHENTA");
                    break;
                    case 90: System.out.println("NOVENTA");
                    break;
                }

            }else {
                int unidades = numero % 10;
                int decenas = (numero - unidades) / 10;
                String unidadeStr = "";
                String decenasStr = "";

                switch (unidades) {
                    case 1: unidadeStr = "uno";
                    break;
                    case 2: unidadeStr = "dos";
                    break;
                    case 3: unidadeStr = "tres";
                    break;
                    case 4: unidadeStr = "cuatro";
                    break;
                    case 5: unidadeStr = "cinco";
                    break;
                    case 6: unidadeStr = "seis";
                    break;
                    case 7: unidadeStr = "siete";
                    break;
                    case 8: unidadeStr = "ocho";
                    break;
                    case 9: unidadeStr = "nueve";
                    break;
                }
                switch (decenas) {
                    case 2: decenasStr = "veinti";
                    break;
                    case 3: decenasStr = "Treinta y ";
                    break;
                    case 4: decenasStr = "Cuarenta y ";
                    break;
                    case 5: decenasStr = "Cinquenta y ";
                    break;
                    case 6: decenasStr = "Sesenta y ";
                    break;
                    case 7: decenasStr = "Setenta y ";
                    break;
                    case 8: decenasStr = "Ochenta y ";
                    break;
                    case 9: decenasStr = "Noventa y ";
                    break;
                    default:
                        break;


                }
                System.out.println("tu numero es " + decenasStr  + unidadeStr);

            }

        }
    }
}
