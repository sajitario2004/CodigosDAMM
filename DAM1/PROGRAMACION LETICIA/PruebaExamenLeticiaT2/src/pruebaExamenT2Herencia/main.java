package pruebaExamenT2Herencia;

public class main {
    public static void main(String[] args) {
        Cliente manolo = new Cliente("manolo", "47193847D", 632485976);
        ArcadeFisica maquinarecre1 = new ArcadeFisica("mario", "toyota", 2005, 1234, "simba",
                "madrid", true, manolo){};

        System.out.println(maquinarecre1.toString());
    }
}
