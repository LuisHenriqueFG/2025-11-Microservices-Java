package br.edu.atitus.currency_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
// Remova o import desnecessário: import org.springframework.boot.SpringApplicationRunListener; 

@SpringBootApplication
@EnableFeignClients
public class CurrencyServiceApplication { // Apenas uma classe de nível superior
	
	public static void main(String[] args) {
		SpringApplication.run(CurrencyServiceApplication.class, args);
	}
}