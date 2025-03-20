package Colecciones.pruebas.ejerprueba1.v1;

public class Persona implements Cliente, Empleado, Comparable<Persona> {

	private int numHoras;
	private float saldo;
	private String dni;
	private String nombre;
	private boolean esEmpleado;
	private boolean esCliente;

	public Persona(int numHoras, float saldo, String dni, String nombre, boolean esEmpleado, boolean esCliente) {
		super();
		this.numHoras = numHoras;
		this.saldo = saldo;
		this.dni = dni;
		this.nombre = nombre;
		this.esEmpleado = esEmpleado;
		this.esCliente = esCliente;
	}

	

	@Override
	public void aumentarSaldo(float cantidad) {
		if (esCliente) {
			saldo = saldo + cantidad;
			System.out.println("Nuevo saldo:" + saldo + " de " + nombre);
		} else {
			System.out.println("La persona " + nombre + " no es cliente");
		}

	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEsEmpleado() {
		return esEmpleado;
	}

	public void setEsEmpleado(boolean esEmpleado) {
		this.esEmpleado = esEmpleado;
	}

	public boolean isEsCliente() {
		return esCliente;
	}

	public void setEsCliente(boolean esCliente) {
		this.esCliente = esCliente;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Persona [numHoras=" + numHoras + ", saldo=" + saldo + ", dni=" + dni + ", nombre=" + nombre
				+ ", esEmpleado=" + esEmpleado + ", esCliente=" + esCliente + "]";
	}



	@Override
	public void numHoras(int incremento) {
		if (esEmpleado) {
			numHoras = numHoras + incremento;
			System.out.println("Horas:" + numHoras + " de " + nombre);
		} else {
			System.out.println("La persona " + nombre + " no es empleado");
		}

	}



	@Override
	public int compareTo(Persona arg0) {
		// TODO Auto-generated method stub
		return this.dni.compareTo(arg0.dni);
	}

}
