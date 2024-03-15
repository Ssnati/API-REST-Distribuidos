package com.edu.uptc.apiRestDistribuidos.controllers;

import com.edu.uptc.apiRestDistribuidos.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {
    @Autowired
    private IPersonRepository repo;

    @GetMapping("/listar")
    public String greeting(Model model) {
        //logica
        model.addAttribute("personas", repo.findAll());
        return "greeting";
    }
}
