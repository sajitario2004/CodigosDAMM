package Clases;

import java.util.*;

public interface Mapa {
	
	public HashMap<String, Receta[]>  redimensionar (HashMap<String, Receta[]> mapa, String categoria );
	
	public HashMap<String, Receta[]>  quitarnull (HashMap<String, Receta[]> mapa, String categoria );

}
