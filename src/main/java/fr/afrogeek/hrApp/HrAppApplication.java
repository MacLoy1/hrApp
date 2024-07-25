package fr.afrogeek.hrApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HrAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrAppApplication.class, args);
	}
	@GetMapping("/")
	public String home(){
		return "Bienvenue sur notre application Spring Boot Developpé par Monsieur Loic Kemayou";
	}

}
