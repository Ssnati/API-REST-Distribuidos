package com.edu.uptc.apiRestDistribuidos.models;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name = "PERSONAS")
public class Persona {
    @Id
    @Column(name = "id_persona")
    private int id;
    @Column(name = "nombre_persona")
    private String firstName;
    @Column(name = "apellido_persona")
    private String lastName;
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;
    @ManyToOne
    @JoinColumn(name = "id_ciudad_origen")
    private City ciudadOrigen;
    @Column(name = "numero_random")
    private int numeroRandom;
    @Column(name = "nombre_cliente")
    private String nombreCliente;
}
