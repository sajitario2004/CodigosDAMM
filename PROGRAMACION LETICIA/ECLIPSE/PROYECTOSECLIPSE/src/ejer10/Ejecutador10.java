package ejer10;

public class Ejecutador10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // Crear libros
	    Libro libro1 = new Libro("eduardo Manos tenedores", "Manolo Escobar glamidia", "1967");
	    Libro libro2 = new Libro("Pepito Grillo", "Mesi", "1949");
	    Libro libro3 = new Libro("El Don Quijote de la Mancha", "Miguel de Cervantes", "1605");

	    // Crear biblioteca
	    Biblioteca biblioteca = new Biblioteca();
	    
	    // Añadir libros a la biblioteca
	    biblioteca.añadirLibro(libro1);
	    biblioteca.añadirLibro(libro2);
	    biblioteca.añadirLibro(libro3);
	    
	    // Mostrar todos los libros disponibles
	    biblioteca.mostrarLibros();
	    
	    // Buscar libros por autor
	    biblioteca.buscarPorAutor("Mesi");
	    biblioteca.buscarPorAutor("Miguel de Cervantes");

	    // Eliminar libro de la biblioteca
	    biblioteca.eliminarLibro("Pepito Grillo");
	    biblioteca.mostrarLibros();

	}

}
