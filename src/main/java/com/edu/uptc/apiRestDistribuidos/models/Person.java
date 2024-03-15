package com.edu.uptc.apiRestDistribuidos.models;

import java.util.Date;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
public class Person {
    private int id;
    private String fisrtName;
    private String lastName;
    private Date fechaNacimiento;
    private int idCiudadOrigen;
    private int numeroRandom;
    private String nombreCliente;
}
