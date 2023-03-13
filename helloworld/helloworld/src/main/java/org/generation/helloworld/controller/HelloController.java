package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// indica para o spring que essa é uma classe controladora
@RestController
//indica um endpoint para nossa aplicação
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/bsn")
	public String bsn() {
		return "- Persistência<br/>"
				+ "- Mentalidade de Crescimento<br/>"
				+ "- Orientação ao Futuro<br/>"
				+ "- Responsabilidade Pessoal<br/>"
				+ "- Trabalho em Equipe<br/>"
				+ "- Comunicação<br/>"
				+ "- Comunicação Não Violenta<br/>"
				+ "- Atenção para Detalhes<br/>"
				+ "- Proatividade";
	}
	
	@GetMapping("/obj")
	public String objetivos() {
		return "- Aprender SpringBoot<br/>"
				+ "- Continuar praticando inglês<br/>"
				+ "- Terminar a formação JAVA da Alura";
	}
}
