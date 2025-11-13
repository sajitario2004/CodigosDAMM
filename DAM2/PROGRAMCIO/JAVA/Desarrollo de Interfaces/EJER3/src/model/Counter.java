package model;

public class Counter {
	private int contador;
	
	public Counter() {
		contador=0;
	}
	
	public void increment() {
		contador++;
	}
	
	public void decrement() {
		contador--;
	}
	
	public int getContador() {
		return contador;
	}
}
