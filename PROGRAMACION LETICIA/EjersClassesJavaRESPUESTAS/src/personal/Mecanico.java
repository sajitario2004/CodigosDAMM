package personal;

public class Mecanico {
//nombre,dni,sueldo y rango
	private String nombre;
	private String dni;
	private String rango;
	private double sueldo;

	// Constructor por defecto
	public Mecanico() {
		super();
	}

	// Constructor con parámetros
	public Mecanico(String nombre, String dni, String rango, double sueldo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.rango = rango;
		this.sueldo = sueldo;
	}

	// Getters and setters
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

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Mecanico [nombre=" + nombre + ", dni=" + dni + ", rango=" + rango + ", sueldo=" + sueldo + "]";
	}

}
