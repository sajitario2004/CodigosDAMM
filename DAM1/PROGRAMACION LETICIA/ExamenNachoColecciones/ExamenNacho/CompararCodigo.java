package Clases;
import java.util.*;

public class CompararCodigo implements Comparator<Receta> {

	@Override
	public int compare(Receta arg0, Receta arg1) {
		// TODO Auto-generated method stub
		return arg0.getCodigo().compareTo(arg1.getCodigo());
	}

}
