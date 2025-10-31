package edu.dam.gamecharacters.model;

public class Character {
    private int id;
    private String nombre;
    private String clase; // Guerrero, Mago, Arquero...
    private int nivel;
    private int puntosVida;

    // Constructor vacío
    public Character() {}

    // Constructor para crear personajes nuevos
    public Character(String nombre, String clase, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getClase() { return clase; }
    public void setClase(String clase) { this.clase = clase; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    public int getPuntosVida() { return puntosVida; }
    public void setPuntosVida(int puntosVida) { this.puntosVida = puntosVida; }

    // toString para mostrar el personaje de forma bonita
    @Override
    public String toString() {
        return String.format("el nombre es " + getNombre() );
    }
}