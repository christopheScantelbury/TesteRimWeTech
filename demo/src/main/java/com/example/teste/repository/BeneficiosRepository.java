package com.example.teste.repository;


import com.example.teste.modal.Beneficios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiosRepository extends JpaRepository<Beneficios, Long> {




}
