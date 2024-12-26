package com.example.teste.controller;

import com.example.teste.Service.BeneficiosService;
import com.example.teste.modal.Beneficios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller

public class BeneficiosController {

    @Autowired
    BeneficiosService beneficiosService;


    @GetMapping(path = "/benefits")
    public List<Beneficios> getAll(){
        return beneficiosService.getAll();
    }


    @PostMapping(path = "/benefits")
    public Beneficios insertBeneficio(@RequestBody Beneficios beneficios){

        return null;
    }


}
