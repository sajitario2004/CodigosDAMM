package Examen.ExamenNacho;
import java.util.*;


public abstract class Planta implements Comparator<Planta>{
	protected String codigoPlantaString;
	protected String nombre;
	protected double precio;
	protected int stock;
	
	

	public Planta(String codigoPlantaString, String nombre, double precio, int stock) {
		super();
		this.codigoPlantaString = codigoPlantaString;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}


	public String getCodigoPlantaString() {
		return codigoPlantaString;
	}



	public void setCodigoPlantaString(String codigoPlantaString) {
		this.codigoPlantaString = codigoPlantaString;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Planta [codigoPlantaString=" + codigoPlantaString + ", nombre=" + nombre + ", precio=" + precio
				+ ", stock=" + stock + "]";
	}


	public void reponerStock(int cantidad) {
		this.stock += cantidad;

	}
	
	public boolean vender(int cantidad) {
		if (this.stock > cantidad) {
			this.stock -= cantidad;
			return true;
		}else {
			return false;
		}
	}

	public double calcularDescuento() {
		return 0;
	};
	
	@Override
	public int compare (Planta p1, Planta p2){
		if (p1.getPrecio() < p2.getPrecio()) {
			return -1;
		}else if (p1.getPrecio() == p2.getPrecio()) {
			return 0;
		}else {
			return 1;
		}
	};

}
