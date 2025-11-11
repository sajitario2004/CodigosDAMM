package model;

public class ActivoInversion extends Activo {
    private String ticker;
    private String descripcion;
    private double beneficioPorcentaje;
    private double dineroInvertido;

    public ActivoInversion(String ticker, String descripcion, String nombre, double precioUltimo, String fechaUltimoPrecio, double beneficioPorcentaje, double dineroInvertido) {
        super(nombre, precioUltimo, fechaUltimoPrecio);
        this.ticker = ticker;
        this.descripcion = descripcion;
        this.beneficioPorcentaje = beneficioPorcentaje;
        this.dineroInvertido = dineroInvertido;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getBeneficioPorcentaje() {
        return beneficioPorcentaje;
    }

    public void setBeneficioPorcentaje(double beneficioPorcentaje) {
        this.beneficioPorcentaje = beneficioPorcentaje;
    }

    public double getDineroInvertido() {
        return dineroInvertido;
    }

    public void setDineroInvertido(double dineroInvertido) {
        this.dineroInvertido = dineroInvertido;
    }

    @Override
    public String toString() {
        return "ActivoInversion{" +
                "ticker='" + ticker + '\'' +
                ", beneficioPorcentaje=" + beneficioPorcentaje +
                ", descripcion='" + descripcion + '\'' +
                ", dineroInvertido=" + dineroInvertido +
                '}';
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Ticker: " + ticker + " , " + descripcion +
                " , Invertido: " + dineroInvertido +
                " , Beneficio: " + beneficioPorcentaje + "%");
    }

}
