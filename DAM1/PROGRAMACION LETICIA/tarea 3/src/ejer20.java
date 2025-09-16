import java.util.Scanner;

public class ejer20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("que clase de cargamento quiere el A o el B: ");
        String aORb = sc.next().toUpperCase();
        System.out.println("Que tamaño tiene su cargamento el tipo 1 o el tipo 2");
        float tipo1OR2 = sc.nextInt();

        String a = "a";
        String b = "b";

        final float precioUVA = (float) (1.5) ;

        boolean aResult = aORb.equals(a);
        boolean bResult = aORb.equals(b);

        if (aResult) {
                if (tipo1OR2 == 1) {
                    float  precioDefinitivo = precioUVA + 20;
                    System.out.println("eL precio de la uva es "+precioDefinitivo);
                }
                if (tipo1OR2 == 2) {
                    float  precioDefinitivo = precioUVA + 30;
                    System.out.println("eL precio de la uva es "+precioDefinitivo);
                }
                if (tipo1OR2 < 1 || tipo1OR2 > 2 ) {
                    System.out.println("error");
                }

        }else if (bResult) {
            if (tipo1OR2 == 1) {
                float  precioDefinitivo = precioUVA - 20;
                System.out.println("eL precio de la uva es"+precioDefinitivo);
            }
            if (tipo1OR2 == 2) {
                float  precioDefinitivo = precioUVA - 50;
                System.out.println("eL precio de la uva es"+precioDefinitivo);
            }
        }
    }
}
