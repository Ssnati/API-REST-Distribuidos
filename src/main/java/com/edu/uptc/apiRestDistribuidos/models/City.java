package com.edu.uptc.apiRestDistribuidos.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
public class City {
    private int id;
    private String nombreCiudad;
}
