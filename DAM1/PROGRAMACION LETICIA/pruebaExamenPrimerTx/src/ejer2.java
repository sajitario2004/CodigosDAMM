import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class ejer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ahora va a tener que ingresar 10 numeros enteros:");
        int [] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i+1) + ": ");
            nums[i] = scanner.nextInt();
        }
        nums = multiploDe5(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] multiploDe5(int[] nums) {
        int [] multiplosDe5 = new int[nums.length];
        int contador = 0;
        for (int i = 0; i < multiplosDe5.length; i++) {
            if (nums[i] % 5 == 0) {
                multiplosDe5[contador] = nums[i];
                contador++;
            }
        }
        for (int i = 0; i < multiplosDe5.length; i++) {
            if (nums[i] % 5 != 0) {
                multiplosDe5[contador] = nums[i];
                contador++;
            }
        }

        return multiplosDe5;

    }
}
