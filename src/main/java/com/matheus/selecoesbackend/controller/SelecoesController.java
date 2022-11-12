package com.matheus.selecoesbackend.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheus.selecoesbackend.controller.exceptions.SelecoesNotFoundException;
import com.matheus.selecoesbackend.model.Selecoes;
import com.matheus.selecoesbackend.repository.SelecoesRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/selecoes")
public class SelecoesController {
    
    private SelecoesRepository selecoesRepository;

    @ApiOperation(value = "Retorna uma lista contento as seleções que irão disputar a copa do mundo de 2022")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Retorna a lista de seleções"),
        @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
        @ApiResponse(code = 500, message = "Internal Error"),
    })
    @GetMapping
    public List<Selecoes> findAll() {
        return selecoesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Selecoes findById(@PathVariable Long id) {
        return selecoesRepository.findById(id).orElseThrow(() -> new SelecoesNotFoundException(id));
    }

    @PostMapping
    public Selecoes create(@RequestBody Selecoes selecao) {
        return selecoesRepository.save(selecao);
    }

    @PutMapping("/{id}")
    public Selecoes edit(@RequestBody Selecoes newSelecao, @PathVariable Long id) {
        return selecoesRepository.findById(id)
                .map(selecao -> {
                    selecao.setNome(newSelecao.getNome());
                    selecao.setSigla(newSelecao.getSigla());
                    return selecao;
                })
                .orElseGet(() -> {
                    return selecoesRepository.save(newSelecao);
                });
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        selecoesRepository.deleteById(id);
    }

}
