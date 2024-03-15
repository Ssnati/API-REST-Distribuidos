package com.edu.uptc.apiRestDistribuidos.rest;

import com.edu.uptc.apiRestDistribuidos.models.Personas;
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
    public List<Personas> getAll() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Personas getById(@PathVariable Long id) {
        Optional<Personas> person = personRepository.findById(id);
        return person.orElse(null);
    }

    @PostMapping
    public void save(@RequestBody Personas person) {
        personRepository.save(person);
    }

    @GetMapping("/city/{id}")
    public List<Personas> getByCity(@PathVariable Long id) {
        List<Personas> persons = new LinkedList<>();
        personRepository.findAll().forEach(person -> {
            if (person.getIdCiudadOrigen() == id) {
                persons.add(person);
            }
        });
        return persons;
    }
}
