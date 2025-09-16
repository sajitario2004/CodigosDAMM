package EjerNoEvaluablesHerenciaT2.ejer1;

public abstract class Vehiculo {
    protected int vehiculosTotales;
    protected int kilometrosTotales;
    protected int kilometrosRecorridos;

    //kilometros totales
    public int getKilometrosTotales() {
        return kilometrosTotales;
    }

    private int sumaKilometrosTotales(int nuevosKilometros) {
        int respuesta = nuevosKilometros + getKilometrosTotales();
        return respuesta;
    }

    //kilometros recorridos por vehiculo
    public abstract void verKilometrosRecorridos();

    public abstract void sumarKilometrosRecorridos();

    //andar veiculo
    public abstract void andar();

    public void verkilometrostotales() {
        System.out.println(kilometrosTotales);
    }
}
