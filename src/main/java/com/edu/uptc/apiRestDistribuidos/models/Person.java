package com.edu.uptc.apiRestDistribuidos.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Person {
    @Id
    private int id;
    private String fisrtName;
    private String lastName;
    private Date fechaNacimiento;
    private int idCiudadOrigen;
    private int numeroRandom;
    private String nombreCliente;
}
