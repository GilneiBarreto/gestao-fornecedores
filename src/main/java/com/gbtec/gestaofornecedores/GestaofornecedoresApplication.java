package com.gbtec.gestaofornecedores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GestaofornecedoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaofornecedoresApplication.class, args);
	}
	
}
