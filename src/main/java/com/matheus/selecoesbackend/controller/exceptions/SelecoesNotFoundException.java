package com.matheus.selecoesbackend.controller.exceptions;

public class SelecoesNotFoundException extends RuntimeException {
    
    public SelecoesNotFoundException(Long id) {
        super("Não foi possível encontrar a seleção com o id: "+id);
    }

}
