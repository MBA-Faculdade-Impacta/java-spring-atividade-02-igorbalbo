package br.com.impacta.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringTemplateApplication.class, args);
	}

}
//palavra Hello world concatenada com o nome.
		//Exmeplo de resposta: Hello world felipe !

    String correto = "Hello world " + nome + "!";

		return ResponseEntity.ok(correto);
    String correto = "Hello world " + nome + " !";
				return ResponseEntity.ok(correto);
	}

}