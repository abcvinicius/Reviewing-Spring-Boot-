package com.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

	@Bean(name = "applicationNome")  // <--- estou dizendo que ele crie esse objeto String no contexto da aplicação para utilizar onde eu precisar 
									 //      posso utilizar o Bean para criar objetos de configuração de banco, aplicação e etc... (isso é so um exemplo)
	public String applicationNome() {
		return "Sistema de Vendas";
	}
}
