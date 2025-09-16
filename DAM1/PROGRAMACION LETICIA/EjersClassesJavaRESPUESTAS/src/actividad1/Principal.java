package actividad1;

import actividad2.Gestor;

public class Principal {

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente();
		cc.setDni("45671233R");
		cc.setNombre("Luis");
		cc.setSaldo(2);
		cc.setBanco("Unicaja");
		cc.mostrarInformacion();
		CuentaCorriente cc1 = new CuentaCorriente();
		cc1.setDni("111212R");
		cc1.setNombre("Ana");
		cc1.setSaldo(50);
		cc1.mostrarInformacion();
		CuentaCorriente cc2 = new CuentaCorriente();
		cc2.crearCuenta("454545R", "Pedro");
		cc2.mostrarInformacion();
		cc2.ingresarDinero(1200);
		cc2.mostrarInformacion();
		cc2.sacarDinero(50);
		cc2.mostrarInformacion();
		// Constructores con parámetros
		CuentaCorriente cc3 = new CuentaCorriente("Jesús","45645454G",890);
		cc3.mostrarInformacion();
		Gestor g=new Gestor("gestor banco", 789456123);
		CuentaCorriente cc4=new CuentaCorriente("Esther", "2514521B", 1000, g);
		cc4.mostrarInformacion();
	}

}
