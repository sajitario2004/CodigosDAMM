package EjerNoEvaluablesHerenciaT2.ejer1mio;

public class LibrosDigitales extends Libros{
    private String formato;
    private int tamanoMB;
    private int numDescargas;

    public LibrosDigitales(String titulo, String autor, String anoPublicacion, String isbn, String formato, int tamanoMB, int numDescargas) {
        super(titulo, autor, anoPublicacion, isbn);
        this.formato = formato;
        this.tamanoMB = tamanoMB;
        this.numDescargas = numDescargas;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getTamanoMB() {
        return tamanoMB;
    }

    public void setTamanoMB(int tamanoMB) {
        this.tamanoMB = tamanoMB;
    }

    public int getNumDescargas() {
        return numDescargas;
    }

    public void setNumDescargas(int numDescargas) {
        this.numDescargas = numDescargas;
    }

    @Override
    public String toString() {
        return "LibrosDigitales{" +
                "formato='" + formato + '\'' +
                ", tamanoMB=" + tamanoMB +
                ", numDescargas=" + numDescargas +
                '}';
    }

    public void mostrarInformacion(){
        System.out.println(toString());
    }
}
