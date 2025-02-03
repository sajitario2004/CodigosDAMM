package ejercicios.ejercicio3Eval;

public class Estudiante {
	private String nombre;
	private int edad;
	private double calificacion;

	public Estudiante(String nombre, int edad, double calificacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.calificacion = calificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getCalificacion() {
		return calificacion;
	}

	@Override
	public String toString() {
		return "Estudiante{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", calificacion=" + calificacion + '}';
	}
}
