/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplos.informes.modelo;

public class Coche {

    private String marca;
    private String matricula;
    private String color;
    private int kilometros;

    public Coche(String marca, String matricula, String color, int kilometros) {
        this.marca = marca;
        this.matricula = matricula;
        this.color = color;
        this.kilometros = kilometros;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }

    public int getKilometros() {
        return kilometros;
    }
}
