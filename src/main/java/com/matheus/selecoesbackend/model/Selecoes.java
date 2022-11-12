package com.matheus.selecoesbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_selecoes")
public class Selecoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(value = "Nome da seleção que disputará a copa do mundo de 2022")
    @Column(length = 100, nullable = false, unique = true)
    private String nome;

    @ApiModelProperty(value = "Sigla da seleção (Tamanho 3)")
    @Column(length = 3, nullable = false)
    private String sigla;    
    
}
