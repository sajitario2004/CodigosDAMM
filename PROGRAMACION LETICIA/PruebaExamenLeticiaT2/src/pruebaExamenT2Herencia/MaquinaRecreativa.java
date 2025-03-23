package pruebaExamenT2Herencia;

public abstract class MaquinaRecreativa {
    protected String nombre;
    protected String fabricante;
    protected int anolanzamiento;
    protected int codigoID;

    public MaquinaRecreativa(String nombre, String fabricante, int anolanzamiento, int codigoID) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.anolanzamiento = anolanzamiento;
        this.codigoID = codigoID;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCodigoID() {
        return codigoID;
    }

    public void setCodigoID(int codigoID) {
        this.codigoID = codigoID;
    }

    public int getAnolanzamiento() {
        return anolanzamiento;
    }

    public void setAnolanzamiento(int anolanzamiento) {
        this.anolanzamiento = anolanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "MaquinaRecreativa{" +
                "nombre='" + nombre + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", anolanzamiento=" + anolanzamiento +
                ", codigoID=" + codigoID +
                '}';
    }

    public abstract void mostrarinformacion();
}
