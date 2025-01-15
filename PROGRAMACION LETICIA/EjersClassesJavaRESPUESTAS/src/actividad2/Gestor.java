package actividad2;

public class Gestor {
	// Atributos
	public String nombre;
	private int telefono;
	double saldoAutorizado;

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public double getSaldoAutorizado() {
		return saldoAutorizado;
	}

	public void setSaldoAutorizado(double saldoAutorizado) {
		this.saldoAutorizado = saldoAutorizado;
	}

	// Constructor por defecto y constructor con parámetros
	public Gestor(String nombre, int telefono, double saldoAutorizado) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.saldoAutorizado = saldoAutorizado;
	}

	public Gestor(String nombre, int telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		saldoAutorizado = 10000;
	}

	public Gestor() {
		super();
	}

	@Override
	public String toString() {
		return "Gestor [nombre=" + nombre + ", telefono=" + telefono + ", saldoAutorizado=" + saldoAutorizado + "]";
	}

}
