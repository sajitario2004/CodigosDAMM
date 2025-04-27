package pruebas1;

public class Usuario implements Comparable<Usuario>{
	private String dni;
	private String nombre;
	private String fechaNacimiento;
	private double cuota;
	
	public Usuario(String dni, String nombre, String fechaNacimiento, double cuota) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.cuota = cuota;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	@Override
	public String toString() {
		return "Usuario [dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", cuota="
				+ cuota + "]";
	}

	@Override
	public int compareTo(Usuario o) {
		// TODO Auto-generated method stub
		return this.getDni().compareTo(o.getDni());
	}
	
	
}
