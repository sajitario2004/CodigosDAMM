package pregunta01;

public class Contacto {

	// se almacenara el ultimo Id que se le asignara al usuario
	public static int contadorIdUsuario = 1;

	private String nombre;
	private String telefono;

	// para almacenar el id del contacto
	private int id;

	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.id = 0;
	}

	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return nombre + " - " + telefono;
	}

	// generar metodos que faltan

}
