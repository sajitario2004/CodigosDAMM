package EjerNoEvaluablesHerenciaT2.ejer1mio;

public class LibrosFisicos extends Libros{
    private int numPaginas;
    private String ubicacionBiblioteca;
    private boolean prestado;
    private Persona persona;

    public LibrosFisicos(String titulo, String autor, String anoPublicacion, String isbn, int numPaginas, String ubicacionBiblioteca, boolean prestado, Persona persona) {
        super(titulo, autor, anoPublicacion, isbn);
        this.numPaginas = numPaginas;
        this.ubicacionBiblioteca = ubicacionBiblioteca;
        this.prestado = prestado;
        this.persona = persona;
    }


    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getUbicacionBiblioteca() {
        return ubicacionBiblioteca;
    }

    public void setUbicacionBiblioteca(String ubicacionBiblioteca) {
        this.ubicacionBiblioteca = ubicacionBiblioteca;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "LibrosFisicos{" +
                "numPaginas=" + numPaginas +
                ", ubicacionBiblioteca='" + ubicacionBiblioteca + '\'' +
                ", prestado=" + prestado +
                ", persona=" + persona +
                '}';
    }

    @Override
    public void mostrarInformacion(){
        System.out.println(toString());
    };
}
