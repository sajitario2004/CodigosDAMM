package EjerNoEvaluablesHerenciaT2.ejer2mio;

public class Gatos extends Mascotas {
    private String pelos;

    public Gatos(String nombre, String raza, String edad, int minutosDeEstancia, int numeroChip, boolean membresia, String pelos) {
        super(nombre, raza, edad, minutosDeEstancia, numeroChip, membresia);
        pelos = comprobarPelos(pelos);
        this.pelos = pelos;
    }

    public String getPelos() {
        return pelos;
    }

    public void setPelos(String pelos) {
        pelos = comprobarPelos(pelos);
        this.pelos = pelos;
    }

    @Override
    public String toString() {
        return "Gatos{" +
                "pelos='" + pelos + '\'' +
                '}';
    }

    public String comprobarPelos(String pelos) {
        if (pelos.equalsIgnoreCase("pelo corto")) {
            return "Pelos corto";
        } else if (pelos.equalsIgnoreCase("pelo largo")) {
            return "Pelos largo";
        }
        return "cantidad de pelo no introducida";
    }

    public int calcularTarifa(int minutos) {
        boolean comprob = false;
        int cont = 0;
        Mascotas masAUX = null;
        int costo=0;

        while (!comprob) {
            if (mascotas[cont].getMinutosDeEstancia() == minutos) {
                masAUX = mascotas[cont];
                break;
            }
        }

        if (masAUX instanceof Gatos) {
            if (((Gatos) masAUX).getPelos().equalsIgnoreCase("pelo corto")) {
                costo = (int) (minutos * 1.5 / 60);
            } else if (((Gatos) masAUX).getPelos().equalsIgnoreCase("pelo largo")) {
                costo = (int) (minutos * 2.5 / 60);
            }

            costo = membresia(costo, masAUX);


        }
        return costo;


    }
}
