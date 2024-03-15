package com.edu.uptc.apiRestDistribuidos.rest;

import com.edu.uptc.apiRestDistribuidos.models.Persona;
import com.edu.uptc.apiRestDistribuidos.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class RestPersonController {

    @Autowired
    private IPersonRepository personRepository;

    @GetMapping("/all")
    public List<Persona> getAll() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Persona getById(@PathVariable Long id) {
        Optional<Persona> person = personRepository.findById(id);
        return person.orElse(null);
    }

    @PostMapping
    public void save(@RequestBody Persona person) {
        personRepository.save(person);
    }

    @GetMapping("/city/{id}")
    public List<Persona> getByCity(@PathVariable Long id) {
        List<Persona> persons = new LinkedList<>();
        personRepository.findAll().forEach(person -> {
            if (person.getCiudadOrigen().getId() == id) {
                persons.add(person);
            }
        });
        return persons;
    }
}
