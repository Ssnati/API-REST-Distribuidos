package com.edu.uptc.apiRestDistribuidos.controllers;

import com.edu.uptc.apiRestDistribuidos.models.Personas;
import com.edu.uptc.apiRestDistribuidos.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/person")
public class PersonController {
    @Autowired
    private IPersonRepository repo;

    @GetMapping("/listar")
    public List<Personas> greeting() {
        return repo.findAll();
    }
}
