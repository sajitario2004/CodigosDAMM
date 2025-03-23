package pruebaExamenT2Herencia;

import java.util.Arrays;

public class SalaRecreativa {
    MaquinaRecreativa[] maquinas= new MaquinaRecreativa[0];
    int cont;

    public SalaRecreativa(MaquinaRecreativa[] maquina) {
        this.maquinas = maquina;
    }

    public MaquinaRecreativa[] getMaquina() {
        return maquinas;
    }

    public void setMaquina(MaquinaRecreativa[] maquina) {
        this.maquinas = maquina;
    }

    @Override
    public String toString() {
        return "SalaRecreativa{" +
                "maquina=" + Arrays.toString(maquinas) +
                '}';
    }

    public boolean encontrarMaquina(String nombre , String fabricante) {
        boolean encontrado = false;
        cont = 0;

        while (!encontrado && cont < maquinas.length) {
            if (maquinas[cont].getNombre().equalsIgnoreCase(nombre) && maquinas[cont].getFabricante().equalsIgnoreCase(fabricante)) {
                encontrado = true;
            }
            cont++;
        }
        if (encontrado) {
            cont--;
        }

        return encontrado;
    }

    public void alquilarMaquina(String nombre , String fabricante, Cliente e) {
        if (encontrarMaquina(nombre, fabricante) && maquinas[cont] instanceof ArcadeFisica) {
            if (((ArcadeFisica) maquinas[cont]).isEstadoAlquiler() == false){
                ((ArcadeFisica) maquinas[cont]).setEstadoAlquiler(true);
                ((ArcadeFisica) maquinas[cont]).setClienteActual(e);
            }else{
                System.out.println("ya esta alquilada");
            }

        }
    }

    public void devolverMaquina(String nombre , String fabricante, Cliente e) {
        if (encontrarMaquina(nombre, fabricante) && maquinas[cont] instanceof ArcadeFisica) {
            if (((ArcadeFisica) maquinas[cont]).isEstadoAlquiler() == true && ((ArcadeFisica) maquinas[cont]).getClienteActual().getDni().equals(e.getDni())){
                ((ArcadeFisica) maquinas[cont]).setEstadoAlquiler(false);
                ((ArcadeFisica) maquinas[cont]).setClienteActual(null);
            }else{
                System.out.println("ya esta alquilada");
            }

        }
    }

    public void jugarMaquina(String nombre , String fabricante) {
        if (encontrarMaquina(nombre, fabricante) && maquinas[cont] instanceof ConsolaVirtuales) {
            System.out.println("Estas jugando a la consola virtual: " + maquinas[cont].getNombre());
            ((ConsolaVirtuales) maquinas[cont]).setPartidasJugadas(((ConsolaVirtuales) maquinas[cont]).getPartidasJugadas()+1);
        }
    }

    public void anadirMaquina(MaquinaRecreativa maquina) {
        if (encontrarMaquina(maquina.getNombre(), maquina.getFabricante())) {
            System.out.println("La maquina ya existe");
        }else {
            MaquinaRecreativa[] aux = Arrays.copyOf(maquinas, maquinas.length + 1 );
        }
    }

    public void eliminarMaquina(String nombre , String fabricante) {
        if (encontrarMaquina(nombre, fabricante)) {
            MaquinaRecreativa[] aux = Arrays.copyOf(maquinas, maquinas.length);
            for (int i = cont; i < maquinas.length-1; i++) {
                aux[i] = maquinas[i+1];
            }
            maquinas = Arrays.copyOf(aux, aux.length - 1);
        }
    }


}
