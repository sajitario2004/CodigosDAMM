package pruebaExamenT2Herencia;

public class ArcadeFisica extends MaquinaRecreativa {

    private String tipoMaquina;
    private String ubicacion;
    private boolean estadoAlquiler = false;
    private Cliente clienteActual;

    public ArcadeFisica(String nombre, String fabricante, int anolanzamiento, int codigoID, String tipoMaquina, String ubicacion, boolean estadoAlquiler, Cliente clienteActual) {
        super(nombre, fabricante, anolanzamiento, codigoID);
        this.tipoMaquina = tipoMaquina;
        this.ubicacion = ubicacion;
        this.estadoAlquiler = estadoAlquiler;
        this.clienteActual = clienteActual;
    }

    public String getTipoMaquina() {
        return tipoMaquina;
    }

    public void setTipoMaquina(String tipoMaquina) {
        this.tipoMaquina = tipoMaquina;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEstadoAlquiler() {
        return estadoAlquiler;
    }

    public void setEstadoAlquiler(boolean estadoAlquiler) {
        this.estadoAlquiler = estadoAlquiler;
    }

    public Cliente getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(Cliente clienteActual) {
        this.clienteActual = clienteActual;
    }

    public void mostrarinformacion(){

    };
}
