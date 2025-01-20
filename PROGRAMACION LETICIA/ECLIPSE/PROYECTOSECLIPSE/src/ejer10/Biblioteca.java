package ejer10;
class Biblioteca {
    private Libro[] libros;
    private int contLibros;

    public Biblioteca() {
        libros = new Libro[20];  // Capacidad máxima de 20 libros
        contLibros = 0;
    }

    public void añadirLibro(Libro libro) {
        if (contLibros < libros.length) {
            libros[contLibros] = libro;
            contLibros++;
            System.out.println("Libro '" + libro.getTitulo() + "' añadido a la biblioteca.");
        } else {
            System.out.println("La biblioteca ha alcanzado su capacidad máxima.");
        }
    }

    public void eliminarLibro(String titulo) {
        for (int i = 0; i < contLibros; i++) {
            if (libros[i].getTitulo().equals(titulo)) {
                // Desplazar los libros a la izquierda
                for (int j = i; j < contLibros - 1; j++) {
                    libros[j] = libros[j + 1];
                }
                libros[contLibros - 1] = null;
                contLibros--;
                System.out.println("Libro '" + titulo + "' eliminado de la biblioteca.");
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no se encuentra en la biblioteca.");
    }

    public void buscarPorAutor(String autor) {
        boolean encontrado = false;
        System.out.println("Libros de " + autor + ":");
        for (int i = 0; i < contLibros; i++) {
            if (libros[i].getAutor().equals(autor)) {
                System.out.println(libros[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros de " + autor + ".");
        }
    }

    public void mostrarLibros() {
        if (contLibros > 0) {
            System.out.println("Libros disponibles en la biblioteca:");
            for (int i = 0; i < contLibros; i++) {
                System.out.println(libros[i]);
            }
        } else {
            System.out.println("No hay libros disponibles en la biblioteca.");
        }
    }
}

