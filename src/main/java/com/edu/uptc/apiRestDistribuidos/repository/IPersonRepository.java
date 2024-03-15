package com.edu.uptc.apiRestDistribuidos.repository;

import com.edu.uptc.apiRestDistribuidos.models.Personas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<Personas, Long> {
}
