package com.edu.uptc.apiRestDistribuidos.repository;

import com.edu.uptc.apiRestDistribuidos.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<Person, Long> {
}
