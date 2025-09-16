package EjerNoEvaluablesHerenciaT2.ejer2mio;

public abstract class Mascotas {
    private String nombre;
    private String raza;
    private String edad;
    private int minutosDeEstancia;
    private int numeroChip;
    private boolean membresia;



    public Mascotas(String nombre, String raza, String edad, int minutosDeEstancia, int numeroChip, boolean membresia) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.minutosDeEstancia = minutosDeEstancia;
        this.numeroChip = numeroChip;
        this.membresia = membresia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getMinutosDeEstancia() {
        return minutosDeEstancia;
    }

    public void setMinutosDeEstancia(int minutosDeEstancia) {
        this.minutosDeEstancia = minutosDeEstancia;
    }

    public int getNumeroChip() {
        return numeroChip;
    }

    public void setNumeroChip(int numeroChip) {
        this.numeroChip = numeroChip;
    }

    public boolean isMembresia() {
        return membresia;
    }

    public void setMembresia(boolean membresia) {
        this.membresia = membresia;
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad='" + edad + '\'' +
                ", minutosDeEstancia=" + minutosDeEstancia +
                ", numeroChip=" + numeroChip +
                ", membresia=" + membresia +
                '}';
    }

    public abstract int calcularTarifa(int minutos);

    public int membresia(int costo, Mascotas mascota){
        if (mascota.isMembresia()){
            return costo*70/100;
        }else {
            return costo;
        }
    }
}
