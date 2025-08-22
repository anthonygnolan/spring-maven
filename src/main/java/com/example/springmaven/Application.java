package com.example.springmaven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Javadoc
 */
@SpringBootApplication
public class Application {

    static Logger logger = LoggerFactory.getLogger(Application.class);
	/**
	 * Sole constructor. (For invocation by subclass
	 * constructors, typically implicit.)
	 */
	Application() { /* Default Constructor */ }

    /**
     * Javadoc
     */
    static void myMethod() {
        logger.warn("I just got executed!");
    }

	/**
	 * Javadoc
	 *
	 * @param args Example
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
