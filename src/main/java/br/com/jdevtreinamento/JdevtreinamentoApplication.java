package br.com.jdevtreinamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.com.jdevtreinamento.model")
public class JdevtreinamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdevtreinamentoApplication.class, args);
	}

}
