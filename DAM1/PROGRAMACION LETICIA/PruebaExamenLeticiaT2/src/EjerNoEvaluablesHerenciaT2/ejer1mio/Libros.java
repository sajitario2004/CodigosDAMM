package EjerNoEvaluablesHerenciaT2.ejer1mio;

public class Libros {
    private String titulo;
    private String autor;
    private String anoPublicacion;
    private String isbn;

    public Libros(String titulo, String autor, String anoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(String anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    @Override
    public String toString() {
        return "Libros{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacion='" + anoPublicacion + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public void mostrarInformacion(){
        System.out.println(toString());
    };
}
