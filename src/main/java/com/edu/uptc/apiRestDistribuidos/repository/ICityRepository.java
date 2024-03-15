package com.edu.uptc.apiRestDistribuidos.repository;

import com.edu.uptc.apiRestDistribuidos.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICityRepository extends JpaRepository<City, Long> {
}
