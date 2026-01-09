package com.dam.api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estudiantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String email;
    private Integer edad;
    private String carrera;

}