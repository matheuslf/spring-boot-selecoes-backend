package com.matheus.selecoesbackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.matheus.selecoesbackend.model.Jogadores;
import com.matheus.selecoesbackend.repository.JogadoresRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/jogadores")
public class JogadoresController {
    
    private JogadoresRepository jogadoresRepository;

    @GetMapping("/selecao")
    public List<Jogadores> findJogadoresSelecao(@RequestParam String nome) {
        return jogadoresRepository.findJogadoresSelecao(nome);
    }

}
