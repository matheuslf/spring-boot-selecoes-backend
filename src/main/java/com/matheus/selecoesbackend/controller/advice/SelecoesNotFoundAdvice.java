package com.matheus.selecoesbackend.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.matheus.selecoesbackend.controller.exceptions.SelecoesNotFoundException;

@ControllerAdvice
public class SelecoesNotFoundAdvice {
    
    @ResponseBody
    @ExceptionHandler(SelecoesNotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public String seleoesNotFoundHandler(SelecoesNotFoundException ex) {
        return ex.getMessage();
    }

}
