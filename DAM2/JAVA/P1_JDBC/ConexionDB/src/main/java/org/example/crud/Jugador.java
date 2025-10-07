package org.example.crud;

public class Jugador {
    private String nombreJugador;

    public Jugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    @Override
    public String toString() {
        return "Jugador: " + nombreJugador;
    }
}

