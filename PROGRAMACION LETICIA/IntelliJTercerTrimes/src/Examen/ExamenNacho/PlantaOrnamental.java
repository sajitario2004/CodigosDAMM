package Examen.ExamenNacho;
import java.util.*;

public class PlantaOrnamental extends Planta{
	private boolean requiereSombra;

	public PlantaOrnamental(String codigoPlantaString, String nombre, double precio, int stock,
			boolean requiereSombra) {
		super(codigoPlantaString, nombre, precio, stock);
		this.requiereSombra = requiereSombra;
	}

	public boolean isRequiereSombra() {
		return requiereSombra;
	}

	public void setRequiereSombra(boolean requiereSombra) {
		this.requiereSombra = requiereSombra;
	}

	
	
	@Override
	public String toString() {
		return "PlantaOrnamental [requiereSombra=" + requiereSombra + ", codigoPlantaString=" + codigoPlantaString
				+ ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}

	@Override
	public double calcularDescuento() {
		double respuesta;
		if (this.requiereSombra == true) {
			respuesta = this.precio * 0.95;
		}else {
			respuesta = this.precio;
		}
		
		return respuesta;
	};
	
	
}