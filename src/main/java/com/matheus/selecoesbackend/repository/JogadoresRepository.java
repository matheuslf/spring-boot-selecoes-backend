package com.matheus.selecoesbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.matheus.selecoesbackend.model.Jogadores;

@Repository
public interface JogadoresRepository extends JpaRepository<Jogadores, Long> {
    
    @Query("SELECT j FROM Jogadores j where j.selecao.nome = :nome")
    public List<Jogadores> findJogadoresSelecao(String nome);

}
