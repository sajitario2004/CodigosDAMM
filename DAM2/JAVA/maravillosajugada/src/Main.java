public class Main {
    public static void main(String[] args) {
        float a = 10;
        float b = 0;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Divido " + a + " por " + b + " Division por cero");
        }

    }
}