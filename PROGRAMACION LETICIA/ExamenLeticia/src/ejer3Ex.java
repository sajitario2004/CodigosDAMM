import java.util.Scanner;

public class ejer3Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fraseCelebre= "la felicidad no brota de la razon, sino de la imaginacion";
        String fraseCelCif = "** ********* ** ***** ** ** *****, **** ** ** ***********";
        String refran= "quien siembra vientos, recoge tempestades";
        String refranCif = "***** ******* *******, ****** ***********";
        String cancion= "yo me mantengo con el alma en vela";
        String cancionCif= "** ** ******** *** ** **** ** ****";
        String comida = "ensalada de rucula, queso feta y tomates";
        String comidaCif= "******** ** ******, ***** **** * *******";

        String letraIrelevante = "";

        System.out.println("Elija que frase desea adivinar: "
        + "\n1 para Frase Celefre" + "\n2 para Refran" + "\n3 para Cancion" + "\n4 para Comida" + "\n");

        String num1Str = sc.nextLine();
        String adivinacion = "1";
        String adivinacionCif = "0";

        if (num1Str.equals("1")) {
            adivinacion = fraseCelebre;
            adivinacionCif = fraseCelCif;
        }else if (num1Str.equals("2")) {
            adivinacion = refran;
            adivinacionCif = refranCif;
        }else if (num1Str.equals("3")) {
            adivinacion = cancion;
            adivinacionCif = cancionCif;
        }else if (num1Str.equals("4")) {
            adivinacion = comida;
            adivinacionCif = comidaCif;
        }else {
            letraIrelevante.equals("-1");
            System.out.println("Eso no esta en la lista");
        }


        String letra = "";

        while (!adivinacion.equals(adivinacionCif)) {

            int suma = (int) Math.floor(Math.random()*250-25);
            int bolsa = 0;

            if (letraIrelevante.equals("-1")){
                break;
            }
            if (letra.equals("-1")) {
                break;
            }
            if (letra.length() > 1){
                break;
            }
            if (bolsa >1 ){

            }


            System.out.println("La frase a adivinar es: " + adivinacionCif);
            letra = sc.nextLine();

            for (int i = 0; i < adivinacion.length()-1; i++) {
                char carac = adivinacion.charAt(i);
                char caracCif = adivinacionCif.charAt(i);
                if (carac == caracCif) {
                    bolsa += suma;
                    adivinacionCif.replace(letra.charAt(0),adivinacionCif.charAt(i));
                }
            }
        }
        if (letra.equals("-1") || letraIrelevante.equals("-1")) {
            System.out.println("El programa finaliza ya");
        }else if (adivinacion.equals(adivinacionCif)) {
            System.out.println("El programa finaliza lo adivinaste ");
        }else {
            System.out.println("Ha habido un error ");
        }

    }
}
