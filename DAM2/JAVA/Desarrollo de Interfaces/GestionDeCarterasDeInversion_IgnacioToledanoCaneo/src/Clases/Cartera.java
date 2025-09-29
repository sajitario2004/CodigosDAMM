package Clases;

import java.util.ArrayList;

public class Cartera {
    private int id;
    private String nombre;
    private int dineroInvert;
    private int dineroCartera;
    private ArrayList<InversionActivos> inversiones;

    public Cartera(ArrayList<InversionActivos> inversiones,  String nombre, int id, int dineroCartera) {
        this.inversiones = inversiones;

        int dineroInvert=0;
        for (InversionActivos inverAUX : inversiones) {
            dineroInvert += inverAUX.getDineroInvertido();
        }

        this.dineroInvert = dineroInvert;

        this.dineroCartera = dineroCartera;
        this.nombre = nombre;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDineroInvert() {
        return dineroInvert;
    }

    public void setDineroInvert(int dineroInvert) {
        this.dineroInvert = dineroInvert;
    }

    public ArrayList<InversionActivos> getInversiones() {
        return inversiones;
    }

    public void setInversiones(ArrayList<InversionActivos> inversiones) {
        inversiones = inversiones;
    }

    public int getDineroCartera() {
        return dineroCartera;
    }

    public void setDineroCartera(int dineroCartera) {
        this.dineroCartera = dineroCartera;
    }

    @Override
    public String toString() {
        return "Cartera{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", dineroInvert=" + dineroInvert +
                ", Inversiones=" + inversiones +
                '}';
    }

    public void quitarActivos(int ticket ){
        ArrayList<InversionActivos> inversionesAux = this.inversiones;
        boolean encontrado = false;
        int dineroGanado;
        for (InversionActivos aux : inversionesAux) {
            if (aux.getTicket() == ticket) {
                dineroGanado = aux.getDineroInvertido() + aux.getDineroGenerado();
                this.dineroCartera = dineroGanado;
                this.dineroInvert -= aux.getDineroInvertido();
                System.out.println("ha recibido en su cartera la cantidad: " + dineroGanado + " gracias a la accion: " + aux.getActivo().getNombre());
            }
        }


    }
}
