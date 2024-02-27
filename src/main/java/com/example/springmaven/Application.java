package com.example.springmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Javadoc
 */
@SpringBootApplication
@RestController
public class Application {

	/**
	 * Sole constructor. (For invocation by subclass
	 * constructors, typically implicit.)
	 */
	Application() { /* Default Constructor */ }

	/**
	 * Javadoc
	 *
	 * @param args Example
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "Spring is here!";
	}

}
