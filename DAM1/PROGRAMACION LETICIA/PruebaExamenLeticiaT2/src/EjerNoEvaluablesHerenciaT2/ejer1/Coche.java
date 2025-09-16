package EjerNoEvaluablesHerenciaT2.ejer1;

public class Coche extends Vehiculo {
    private String tieneABS;
    private String queMotorTiene;

    // constructor
    public Coche(String tieneABS, String queMotorTienem, int kilometrosRecorridos) {
        this.tieneABS = tieneABS;
        this.queMotorTiene = queMotorTiene;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }



    public void andar() {
        System.out.println("Andando Coche");
    }

    void verKilometrostotales() {}

    @Override
    public void verKilometrosRecorridos() {

    }

    public void sumarKilometrosRecorridos() {}

}
