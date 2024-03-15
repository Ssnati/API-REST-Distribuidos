package com.edu.uptc.apiRestDistribuidos.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table (name = "PERSONAS")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int id;
    @Column (name = "nombre_persona")
    private String firstName;
    @Column (name = "apellido_persona")
    private String lastName;
    @Column (name = "fecha_naccimiento")
    private Date fechaNacimiento;
    @Column (name = "id_ciudad_origen")
    private int idCiudadOrigen;
    @Column (name = "numero_random")
    private int numeroRandom;
    @Column (name = "nombre_cliente")
    private String nombreCliente;
}
