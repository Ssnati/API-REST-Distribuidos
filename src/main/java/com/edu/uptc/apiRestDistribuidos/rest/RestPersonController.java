package com.edu.uptc.apiRestDistribuidos.rest;

import com.edu.uptc.apiRestDistribuidos.models.Person;
import com.edu.uptc.apiRestDistribuidos.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class RestPersonController {

    @Autowired
    private IPersonRepository personRepository;

    @GetMapping("/all")
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Person getById(Long id) {
        return personRepository.findById(id).get();
    }

    @PostMapping
    public void save(@RequestBody Person person) {
        personRepository.save(person);
    }

    @GetMapping("/city/{id}")
    public List<Person> getByCity(Long id) {
        List<Person> people = personRepository.findAll();
        people.removeIf(person -> person.getIdCiudadOrigen() != id);
        return people;
    }
}