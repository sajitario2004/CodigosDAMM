package pruebas1.Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Activo {
    private String nombre;
    private int preciUlti;
    private String fech;
    private Map<String, Integer> historicoPrecio;
    private ArrayList<String> historicoFechas = new ArrayList<String>();

    public Activo(int preciUlti, String nombre, String fech) {
        this.preciUlti = preciUlti;
        this.nombre = nombre;
        this.fech = fech;
        this.historicoFechas = new ArrayList<>();
        this.historicoFechas.add(fech);
        this.historicoPrecio = new HashMap<String, Integer>();
        this.historicoPrecio.put(fech, preciUlti);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPreciUlti() {
        return preciUlti;
    }

    public void setPreciUlti(int preciUlti) {
        this.preciUlti = preciUlti;
    }

    public String getFech() {
        return fech;
    }

    public void setFech(String fech) {
        this.fech = fech;
    }

    public Map<String, Integer> getHistoricoPrecio() {
        return historicoPrecio;
    }

    public void setHistoricoPrecio(Map<String, Integer> historicoPrecio) {
        this.historicoPrecio = historicoPrecio;
    }

    public ArrayList<String> getHistoricoFechas() {
        return historicoFechas;
    }

    public void setHistoricoFechas(ArrayList<String> historicoFechas) {
        this.historicoFechas = historicoFechas;
    }

    @Override
    public String toString() {
        return "Activos{" +
                "nombre='" + nombre + '\'' +
                ", PreciUlti=" + preciUlti +
                ", fech=" + fech +
                '}';
    }

    public void actuPrecio(String newFecha){
        this.preciUlti += (int) (Math.random()*100-25);
        this.historicoPrecio.put(newFecha, this.preciUlti);
        this.historicoFechas.add(newFecha);
        this.fech=newFecha;
    }

}
