package Clases;

import java.util.*;

public class GestionPostres implements Mapa{
	
	private HashMap<String, Receta> recetas = new HashMap<>();
	

	public GestionPostres(HashMap<String, Receta> recetas) {
		super();
		this.recetas = recetas;
	}
	
	

	public HashMap<String, Receta> getRecetas() {
		return recetas;
	}

	public void setRecetas(HashMap<String, Receta> recetas) {
		this.recetas = recetas;
	}
	
	

	@Override
	public String toString() {
		return "GestionPostres [recetas=" + recetas + "]";
	}

	@Override
	public HashMap<String, Receta[]> redimensionar (HashMap<String, Receta[]> mapa, String categoria ){
		Receta[] aux = Arrays.copyOf(mapa.get(categoria), mapa.get(categoria).length+1 );
		mapa.put(categoria, aux);
		
		return mapa;
	}
	
	@Override
	public HashMap<String, Receta[]> quitarnull (HashMap<String, Receta[]> mapa, String categoria ){
	
		int cont=0;
		int cont2=0;
		Receta[] aux1 = new Receta[mapa.get(categoria).length];
		
		Receta mapaAntiguo = mapa.get(categoria);
		
		for (int i = 0; i < mapaAntiguo.length ; i++ ) {
			if (mapaAntiguo[i] != null) {
				aux1[cont2] = mapaAntiguo[i];
				cont2++;
			}else if(mapaAntiguo[i] == null) {
				cont++;
			}
			
		}
		
		Receta[] aux2 = Arrays.copyOf(aux1, aux1.length-cont);
		
		mapa.put(categoria, aux2);
		return mapa;
		
	};
	
	public void agregarReceta(String categoria, Receta receta) {
		
		if(this.recetas.containsKey(categoria)) {
			Receta[] rcAux = new Receta[1];
			rcAux[0]=receta;
			this.recetas.put(categoria, rcAux);
		}else {
		
			this.recetas = redimensionar(this.recetas, categoria );
			Receta[] rcAux = this.recetas.get(categoria);
			rcAux[rcAux.length-1]=receta;
			this.recetas.put(categoria, rcAux);
		}
		
	}
	
	public void eliminarReceta(String categoria, String codigo) {
		Receta[] aux =this.recetas.get(categoria);
		for(int i =0 ; i< aux.length; i++) {
			if (aux[i].getCodigo() == codigo) {
				aux[i] =null;
			}
		}
		this.recetas.put(categoria, aux);
		quitarnull (this.recetas, categoria );
	}
	
	public void actualizarReceta(String categoria, String codigo, String nuevoNombre, List<String> nuevosIngredientes) {
		Receta[] aux = this.recetas.get(categoria);
		for (int i = 0; i < aux.length; i++) {
			if(aux[i].getCodigo()== codigo) {
				aux[i].setNombre(nuevoNombre);
				aux[i].setIngredientes(nuevosIngredientes);
			}
		}
	}
	
	public Receta buscarReceta(String categoria, String codigo) {
		Receta[] aux = this.recetas.get(categoria);
		for (int i = 0; i < aux.length; i++) {
			if(aux[i].getCodigo()== codigo) {
				Receta respuesta = aux[i];
				return respuesta;
			}
		}
		return null;
	}
	
	public List<Receta> filtrarPorIngredientes(String ingrediente){
		
		List<Receta> a;
		
		Set<String> categorias0 = this.recetas.keySet();
		Iterator<String> catIT = categorias0.iterator();
		while(catIT.hasNext()) {
			String cat = catIT.next();
			Receta[] receAux = recetas.get(cat);
		}
		
		
		
		
		return null;
	}
	


}
