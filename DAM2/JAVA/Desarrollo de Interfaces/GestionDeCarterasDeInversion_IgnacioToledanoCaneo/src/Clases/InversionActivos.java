package Clases;

public class InversionActivos {
    private int ticket;
    private String descript;
    private int dineroInvertido;
    private int dineroGenerado;
    private int beneficioPorcentaje;
    private Activo activo;

    public InversionActivos(int ticket, String descript, Activo activo, int dineroInvertido) {
        this.ticket = ticket;
        this.descript = descript;
        this.activo = activo;
        this.dineroInvertido= dineroInvertido;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public int getDineroInvertido() {
        return dineroInvertido;
    }

    public void setDineroInvertido(int dineroInvertido) {
        this.dineroInvertido = dineroInvertido;
    }

    public int getDineroGenerado() {
        return dineroGenerado;
    }

    public void setDineroGenerado(int dineroGenerado) {
        this.dineroGenerado = dineroGenerado;
    }

    public int getBeneficioPorcentaje() {
        return beneficioPorcentaje;
    }

    public void setBeneficioPorcentaje(int beneficioPorcentaje) {
        this.beneficioPorcentaje = beneficioPorcentaje;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "InversionActivos{" +
                "ticket=" + ticket +
                ", descript='" + descript + '\'' +
                ", dineroInvertido=" + dineroInvertido +
                ", dineroGenerado=" + dineroGenerado +
                ", beneficioPorcentaje=" + beneficioPorcentaje +
                ", activo=" + activo +
                '}';
    }

    public void calcbeneficio() {
        String fechPrecio1= activo.getHistoricoFechas().getFirst();
        int precio1 = activo.getHistoricoPrecio().get(fechPrecio1);
        String fechPrecio2 = activo.getHistoricoFechas().getLast();
        int precio2 = activo.getHistoricoPrecio().get(fechPrecio2);

        this.beneficioPorcentaje= precio2 / precio1 + 100;
        this.dineroGenerado= (this.dineroInvertido * (this.beneficioPorcentaje / 100)) - this.dineroInvertido;
    }

}
