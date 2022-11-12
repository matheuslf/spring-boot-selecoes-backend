package com.matheus.selecoesbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "tb_jogadores")
public class Jogadores {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Selecoes selecao;

    @Column(length = 30, nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private Integer idade;

    @Column(length = 30, nullable = false)
    private String posicao;

}
