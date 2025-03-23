package EjerNoEvaluablesHerenciaT2.ejer1mio;

import java.util.Arrays;

public class Biblioteca {
    Libros[] libros = new Libros[0];
    int cont = 0;

    //metodos hechos por mi
    public boolean existeLibro(String titulo){
        boolean resultado = false;

        cont = 0;

        while(!resultado || cont < libros.length){
            if (libros[cont].getTitulo().equals(titulo)){
                resultado = true;
            }
            cont++;
        }
        cont = 0;
        return resultado;
    }

    //metodos de biblioteca
    public void prestarLibro(String titulo, String autor, Persona p){
        Libros lib = buscarLibro(titulo, autor);
        if (lib instanceof LibrosFisicos) {
            if (((LibrosFisicos) lib).getPersona() == null){
                ((LibrosFisicos) lib).setPersona(p);
            }else {
                System.out.println("El libro " + titulo + " ya ha sido prestado");
            }
        }
    }

    public void devolverLibro(String titulo, String autor, Persona p) {
        Libros lib = buscarLibro(titulo, autor);
        if (lib instanceof LibrosFisicos){
            if (((LibrosFisicos) lib).getPersona().getDni().equalsIgnoreCase(p.getDni())){
                ((LibrosFisicos) lib).setPersona(null);
                System.out.println("El libro " + titulo + " ha sido devuelto");
            }
        }else {
            System.out.println("El libro no existe o no es un libro fisico");
        }
    }

    public void descargarLibro(String titulo, String autor) {
        Libros lib = buscarLibro(titulo, autor);
        if (lib instanceof LibrosDigitales){
            ((LibrosDigitales) lib).setNumDescargas(((LibrosDigitales) lib).getNumDescargas()+1);
            System.out.println("El libro ha sido descargado");
        }else {
            System.out.println("El libro no existe o no es un libro digital");
        }
    }

    public void anadirLibro(Libros l){
        boolean existe = existeLibro(l.getTitulo());
        if (!existe){
            Libros[] aux;
            aux = Arrays.copyOf(libros, libros.length + 1);
            aux[aux.length - 1] = l;
            libros = aux;
            aux = null;

            System.out.println("El libro " + l.getTitulo() + " ha sido anadido");
        } else {
            System.out.println("El libro " + l.getTitulo() + " ya existe");
        }
    }

    public void eliminarLibro(String titulo, String autor) {
        Libros lib = buscarLibro(titulo, autor);
        boolean existe = existeLibro(lib.getTitulo());
        if (existe){
            cont = 0;
            Libros[] aux = new Libros[libros.length-1];
            for (int i = 0; i < libros.length; i++){
                if (libros[i] != lib){
                    aux[cont] = libros[i];
                }
                cont++;
            }
            libros = aux;
            System.out.println("El libro " + titulo + " ha sido eliminado");
            aux = null;
        }else {
            System.out.println("El libro " + titulo + " no existe");
        }

    }

    public Libros buscarLibro(String titulo, String autor) {
        for (int i = cont ; i < libros.length ; i++){
            if (libros[i].getTitulo().equals(titulo) && libros[i].getAutor().equals(autor)){
                if (libros[i] instanceof LibrosDigitales){
                    libros[i] = (LibrosDigitales) libros[i];
                    return libros[i];
                }
                if (libros[i] instanceof LibrosFisicos){
                    libros[i] = (LibrosFisicos) libros[i];
                    return libros[i];
                }
            }
        }
        return null;
    }

    public void contarDescargas(){
        int numDescargas= 0;
        for (int i = 0; i < libros.length; i++){
            if (libros[i] instanceof LibrosDigitales){
                numDescargas+=((LibrosDigitales) libros[i]).getNumDescargas() ;
            }
        }
        System.out.println("El numero de descargas totales es de " + numDescargas + " descargas");
    }
}
