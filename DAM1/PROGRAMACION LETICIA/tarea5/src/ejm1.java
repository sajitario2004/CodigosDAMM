import java.util.Scanner;

public class ejm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el primer numero");
        int n1 = sc.nextInt();
        System.out.println("introduzca el segundo numero");
        int n2 = sc.nextInt();
        interar(n1,n2);
    }
    public static void interar(int a, int b) {
        if (a<=b){
            for(int i=a;i<=b;i++){
                System.out.print("Numero: "+ i +"\n");
            }
        }else {
            for(int i=b;i<=a;i++){
                System.out.print("Numero: " + i + "\n");
            }
        }
    }
}
