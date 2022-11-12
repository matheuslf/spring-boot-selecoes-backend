package com.matheus.selecoesbackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.matheus.selecoesbackend.model.Selecoes;
import com.matheus.selecoesbackend.repository.SelecoesRepository;

@SpringBootApplication
public class SelecoesBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelecoesBackendApplication.class, args);
	}

	/**
	@Bean
	CommandLineRunner initDatabase(SelecoesRepository selecoesRepository) {
		return args -> {

			selecoesRepository.deleteAll();

			Selecoes selecao = new Selecoes();
			selecao.setNome("BRASIL");
			selecao.setSigla("BRL");

			selecoesRepository.save(selecao);
		};
	} */

}
