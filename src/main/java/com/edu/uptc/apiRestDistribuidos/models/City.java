package com.edu.uptc.apiRestDistribuidos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name = "CIUDADES")
public class City {
    @Id
    @Column(name = "id_ciudad")
    private int id;
    @Column(name = "nombre_ciudad")
    private String nombreCiudad;
}
