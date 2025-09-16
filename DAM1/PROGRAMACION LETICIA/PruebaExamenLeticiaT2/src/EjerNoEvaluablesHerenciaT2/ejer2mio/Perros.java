package EjerNoEvaluablesHerenciaT2.ejer2mio;

public class Perros extends Mascotas {
    private String tamano;

    public Perros(String nombre, String raza, String edad, int minutosDeEstancia, int numeroChip, boolean membresia, String tamano) {
        super(nombre, raza, edad, minutosDeEstancia, numeroChip, membresia);
        tamano = comprobarTamano(tamano);
        this.tamano = tamano;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        tamano = comprobarTamano(tamano);
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perros{" +
                "tamano='" + tamano + '\'' +
                '}';
    }

    public String comprobarTamano(String tamano) {
        if (tamano.equalsIgnoreCase("pequeño")) {
            return "Pequeño";
        }else if (tamano.equalsIgnoreCase("mediano")) {
            return "Mediano";
        }else if (tamano.equalsIgnoreCase("grande")) {
            return "Grande";
        }

        return "Tamaño no especificado";
    }



    public int calcularTarifa(int minutos) {
        boolean comprob = false;
        int cont = 0;
        Mascotas masAUX = null;
        int costo=0;
        Mascotas[] mascotas = getMascotas();

        while (!comprob) {
            if (mascotas[cont].getMinutosDeEstancia() == minutos) {
                masAUX = mascotas[cont];
                break;
            }
        }
        if (masAUX instanceof Perros) {
            if (((Perros) masAUX).getTamano().equalsIgnoreCase("Pequeño")) {
                costo = minutos * 2 / 60;
            } else if (((Perros) masAUX).getTamano().equalsIgnoreCase("Mediano")) {
                costo = minutos * 3 / 60;
            } else if (((Perros) masAUX).getTamano().equalsIgnoreCase("Grande")) {
                costo = minutos * 4 / 60;
            }
        }

        costo = membresia(costo, masAUX);

        return costo;


    }

}
