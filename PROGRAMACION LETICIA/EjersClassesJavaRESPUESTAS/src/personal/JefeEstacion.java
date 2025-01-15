package personal;

public class JefeEstacion {

	private String nombre;
	private String dni;
	private String fecha;

//Constructores
	public JefeEstacion(String nombre, String dni, String fecha) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fecha = fecha;
	}

	public JefeEstacion() {
		super();
	}
//Getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "JefeEstacion [nombre=" + nombre + ", dni=" + dni + ", fecha=" + fecha + "]";
	}

}
