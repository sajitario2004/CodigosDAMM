package com.ejemplo.model;

import jakarta.persistence.*;

@Entity

@Table(name = "usuarios")

public class Usuario {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)

    private String nombre;

    @Column(name = "email", unique = true, length = 150)

    private String email;

    // Constructor vacío (requerido por Hibernate)

    public Usuario() {
    }

    // Constructor con parámetros

    public Usuario(String nombre, String email) {

        this.nombre = nombre;

        this.email = email;

    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override

    public String toString() {

        return "Usuario{id=" + id + ", nombre='" + nombre +

                "', email='" + email + "'}";

    }

}