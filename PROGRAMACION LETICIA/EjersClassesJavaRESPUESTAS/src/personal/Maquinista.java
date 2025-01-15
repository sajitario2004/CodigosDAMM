package personal;

public class Maquinista {
//nombre,tle,especialidad
	private String nombre;
	private int telefono;

	private enum Especialidad {
		frenos, hidraulica, electricidad, motor
	};

	private Especialidad especialidad; // Esta variable podría ser una String
	// Constructores

	public Maquinista() {
		super();
	}

	public Maquinista(String nombre, int telefono, Especialidad especialidad) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = especialidad;
	}

	// Getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Maquinista [nombre=" + nombre + ", telefono=" + telefono + ", especialidad=" + especialidad + "]";
	}

}
