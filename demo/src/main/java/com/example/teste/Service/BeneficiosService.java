package com.example.teste.Service;

import com.example.teste.modal.Beneficios;
import com.example.teste.repository.BeneficiosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficiosService {


    @Autowired
    BeneficiosRepository beneficiosRepository;


    public List<Beneficios> getAll(){
        return  beneficiosRepository.findAll();
    }



}
