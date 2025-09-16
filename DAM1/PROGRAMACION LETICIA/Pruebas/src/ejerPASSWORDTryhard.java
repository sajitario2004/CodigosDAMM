import java.util.Scanner;

public class ejerPASSWORDTryhard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comprobacion = "1234";
        System.out.println("\nLa contraseña es "+comprobacion+"\n");

        System.out.print("");
        boolean verificacion = false;

        String pwrTryhard = "";

        String digit1="*";
        String digit2="*";
        String digit3="*";
        String digit4="*";
        while (!verificacion) {

            pwrTryhard = digit1+digit2+digit3+digit4;

            System.out.println("Introduzca una contraseña (La contraseña tiene 4 caracteres): \nSi tiene mas de 4 caracteres o menos la contraseña sera invalida "+"\n"+pwrTryhard+"\n");
            String password = sc.next();

            int longPass = password.length();
            int pwr1 = password.charAt(0) -48;

            int pwr2 = password.charAt(1) - 48;

            int pwr3 = password.charAt(2) - 48;

            int pwr4 = password.charAt(3) - 48;

            if (longPass == 4) {
                if (pwr1 == 1){
                    digit1 = "1";
                }
                if (pwr2 == 2){
                    digit2 = "2";
                }
                if (pwr3 == 3){
                    digit3 = "3";
                }
                if (pwr4 == 4){
                    digit4 = "4";
                }


                if (comprobacion.equals(password)) {
                   verificacion = true;
                }

            } else {
                System.out.println("Ha introducido mas de 4 caracteres o menos de 4 caracteres, No es valida");
            }
        }
        System.out.println("La contraseña es correcta");
        sc.close();
    }
}
