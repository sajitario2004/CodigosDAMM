package Clases;

import java.util.*;

public class Receta implements Comparable<Receta>{
	protected String nombre;
	protected String codigo;
	protected List<String> ingredientes;
	
	
	
	public Receta(String nombre, String codigo, List<String> ingredientes) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.ingredientes = ingredientes;
	}
	
	
	


	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getCodigo() {
		return codigo;
	}





	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}





	public List<String> getIngredientes() {
		return ingredientes;
	}





	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}





	@Override
	public String toString() {
		return "Receta [nombre=" + nombre + ", codigo=" + codigo + ", ingredientes=" + ingredientes + "]";
	}





	@Override
	public int compareTo(Receta arg0) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(arg0.nombre);
	}
	
	
	
	
}
