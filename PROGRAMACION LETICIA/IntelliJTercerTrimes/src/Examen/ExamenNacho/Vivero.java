package Examen.ExamenNacho;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import Examen.ExamenNacho.GestionVivero;
public class Vivero implements GestionVivero {
	
	// lo hago en set por que no se permiten duplicados
	Set<Planta> plantas;
	
	
	public Vivero(Set<Planta> plantas) {
		super();
		this.plantas = plantas;
	}
	
	
	public Set<Planta> getPlantas() {
		return plantas;
	}


	public void setPlantas(Set<Planta> plantas) {
		this.plantas = plantas;
	}
	
	

	@Override
	public String toString() {
		return "Vivero [plantas=" + plantas + "]";
	}

	@Override
	public Set<Planta> filtrarPorCategoriaSet(Planta categoria){

		Set<Planta> respuestaPlantas = new HashSet<Planta>();
		Iterator<Planta> plantas = this.plantas.iterator();
		while(plantas.hasNext()) {
			Planta pl = plantas.next();
			if (categoria instanceof PlantaFrutal && pl instanceof PlantaFrutal) {
				respuestaPlantas.add(pl);
			}else if(categoria instanceof PlantaOrnamental && pl instanceof PlantaOrnamental){
				respuestaPlantas.add(pl);
			}else if (categoria instanceof PlantasMedicinales&& pl instanceof PlantasMedicinales) {
				respuestaPlantas.add(pl);
			}
		}
		return respuestaPlantas;
	};
	
	@Override
	public List<String> obtenerNombresPlantas(){
		List<String> respuestaList = new ArrayList<String>();
		Iterator<Planta> plantas = this.plantas.iterator();
		while(plantas.hasNext()) {
			Planta pl = plantas.next();
			respuestaList.add(pl.getNombre());
		}
		return respuestaList;
	};
	
	public void agregarPlanta(Planta planta) {
		//no se permiten duplicados por es lo he hecho con un set 
		plantas.add(planta);
	}
	

	public void eliminarPlanta(String codigoPlanta) {
		Iterator<Planta> plantasit = this.plantas.iterator();
		while (plantasit.hasNext()) {
			Planta pl = plantasit.next();
			if (pl.getCodigoPlantaString().equals(codigoPlanta)) {
				plantasit.remove();
			}
		}
	}
	
	

}
