package ejercicio3;

public class Persona {
	private String nombre;
	private int edad;

	public Persona() {
		super();

	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public boolean esMayorEdad() {
		boolean resultado = false;
		if (edad >= 18) {
			resultado = true;
		}
		return resultado;
	}

}
