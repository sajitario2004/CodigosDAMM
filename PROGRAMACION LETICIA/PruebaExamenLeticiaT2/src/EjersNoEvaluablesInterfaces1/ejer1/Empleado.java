package EjersNoEvaluablesInterfaces1.ejer1;



public class Empleado extends Jornada {

    private String nombre;
    private String dni;
    private String fecha;


    public Empleado(String nombre, String dni, String fecha, int horaEntrada, int horaSalida) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    private int minutos;
    public int getMinutos() {
        return minutos = (getHoraEntrada() - getHoraSalida()) * 60;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fecha='" + fecha +
                ", minutos=" + getMinutos() +
                '}';
    }
}
