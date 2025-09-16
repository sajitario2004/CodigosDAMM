package Interfaces.pruebas.examenpruebas.clases;

public class Visita {
	private String nombre;
	private String apellidos;
	private String direccion;
	private int telefono;
	private String idVisita;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param nombre
	 * @param apellidos
	 * @param direccion
	 * @param telefono
	 */
	public Visita(String nombre, String apellidos, String direccion, int telefono,String idVisita) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.idVisita=idVisita;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Visita [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}
	public String getIdVisita() {
		return idVisita;
	}
	public void setIdVisita(String idVisita) {
		this.idVisita = idVisita;
	}
}
