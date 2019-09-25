package edu.fiap.aula2.cotacao.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class ServiceConfig {
	
	@Value("${cotacao.dolar}")
	private double cotacaoDolar;
	
	public double getCotacao() {
		return cotacaoDolar;
	}

	
	
}
