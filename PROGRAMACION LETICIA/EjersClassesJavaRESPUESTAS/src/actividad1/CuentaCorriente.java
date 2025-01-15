package actividad1;

import actividad2.Gestor;

public class CuentaCorriente {

	private String nombre;// Visibilidad total
	private String dni; // Por defecto
	private double saldo; // Visibilidad solo en la clase
	private static String banco = "BBVA";
	private Gestor gestor;

	public CuentaCorriente(String nombre, String dni, double saldo, Gestor gestor) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = saldo;
		this.gestor = gestor;
	}

	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public CuentaCorriente() {
		super();
	}

	public CuentaCorriente(String nombre, String dni, double saldo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = saldo;
	}

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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static String getBanco() {
		return banco;
	}

	public static void setBanco(String banco) {
		CuentaCorriente.banco = banco;
	}

	public void crearCuenta(String dni, String nombreTitular) {
		nombre = nombreTitular;
		this.dni = dni;
		saldo = 0;
	}

	public void sacarDinero(double dineroRetirar) {
		if (saldo < dineroRetirar) {
			System.out.println("No tienes saldo suficiente");
		} else {
			saldo = saldo - dineroRetirar;
			System.out.println("Has retirado correctamente " + dineroRetirar + "te queda " + saldo);
		}
	}

	public void ingresarDinero(double dineroIngresar) {
		saldo = saldo + dineroIngresar;
	}

	public void mostrarInformacion() {
		System.out.println("Titular:" + nombre);
		System.out.println("DNI:" + dni);
		System.out.println("Saldo:" + saldo);
		System.out.println("Banco:" + banco);
		System.out.println("Gestor:" + gestor);
	}
}
