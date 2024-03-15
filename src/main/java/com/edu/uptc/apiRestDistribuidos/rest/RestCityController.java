package com.edu.uptc.apiRestDistribuidos.rest;

import com.edu.uptc.apiRestDistribuidos.models.City;
import com.edu.uptc.apiRestDistribuidos.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class RestCityController {

    @Autowired
    private ICityRepository cityRepository;

    @GetMapping("/all")
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @GetMapping("/{id}")
    public City getById(Long id) {
        return cityRepository.findById(id).get();
    }

    @PostMapping
    public void save(@RequestBody City city) {
        cityRepository.save(city);
    }
}