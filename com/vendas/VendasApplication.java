package com.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

	@Autowired
	@Qualifier("applicationNome")
	private String applicationNome;
	
	@GetMapping("/hello")
	public String HelloWord() {
		return applicationNome;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);  //inicialização do comando springboot
	}

}
