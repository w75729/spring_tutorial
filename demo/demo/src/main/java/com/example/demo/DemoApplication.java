package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "<h1>Laboratorium Spring Boot</h1>" +
				"<p><b>Imię i Nazwisko:</b> Furkan Akgun</p>" +
				"<p><b>Numer indeksu:</b> 75729</p>";
	}
}