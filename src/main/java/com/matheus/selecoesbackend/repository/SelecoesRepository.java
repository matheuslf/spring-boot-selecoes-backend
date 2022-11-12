package com.matheus.selecoesbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheus.selecoesbackend.model.Selecoes;

@Repository
public interface SelecoesRepository extends JpaRepository<Selecoes, Long> {
    
}
