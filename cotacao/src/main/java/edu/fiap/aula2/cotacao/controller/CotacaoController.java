package edu.fiap.aula2.cotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.fiap.aula2.cotacao.config.ServiceConfig;

@RestController
@RequestMapping("/cotacao")
public class CotacaoController {

	@Autowired
	ServiceConfig serviceConfig;
	
	@GetMapping("/{dolar}")
	public double getCotacao(@PathVariable("dolar") int valor)
	{
		return serviceConfig.getCotacao()  * valor;
  		
	}
	
	
}
