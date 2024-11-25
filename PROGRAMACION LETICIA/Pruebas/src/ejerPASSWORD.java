import java.util.Scanner;

public class ejerPASSWORD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comprobacion = "1234";
        System.out.println("\nLa contraseña es "+comprobacion+"\n");
        System.out.print("");
        boolean verificacion = false;

        while (!verificacion) {
            System.out.println("Introduzca una contraseña (La contraseña tiene 4 caracteres): \nSi tiene mas de 4 caracteres o menos la contraseña sera invalida");
            String password = sc.next();
            int longPass = password.length();
            if (longPass == 4) {
                if (comprobacion.equals(password)) {
                    verificacion = true;
                }
            } else {
                System.out.println("Ha introducido mas de 4 caracteres o menos de 4 caracteres, No es valida");
            }
        }
        System.out.println("La contraseña es correcta");
    }
}
