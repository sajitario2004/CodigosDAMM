package pruebaExamenT2Herencia;

public class ConsolaVirtuales extends MaquinaRecreativa {
    private String plataforma;
    private String ubicacion;
    private int partidasJugadas;

    public ConsolaVirtuales(String nombre, String fabricante, int anolanzamiento, int codigoID, String plataforma, String ubicacion, int partidasJugadas) {
        super(nombre, fabricante, anolanzamiento, codigoID);
        this.plataforma = plataforma;
        this.ubicacion = ubicacion;
        this.partidasJugadas = partidasJugadas;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    @Override
    public String toString() {
        return "ConsolaVirtuales{" +
                "plataforma='" + plataforma + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", partidasJugadas=" + partidasJugadas +
                ", nombre='" + nombre + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", anolanzamiento=" + anolanzamiento +
                ", codigoID=" + codigoID +
                '}';
    }

    public void mostrarinformacion(){};
}
