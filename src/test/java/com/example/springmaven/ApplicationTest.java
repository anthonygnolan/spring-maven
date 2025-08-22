package com.example.springmaven;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.springmaven.Application.myMethod;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Javadoc
 */
@SpringBootTest
class ApplicationTest {

	/**
	 * Sole constructor. (For invocation by subclass
	 * constructors, typically implicit.)
	 */
	ApplicationTest() { /* Default Constructor */ }

	/**
	 * Javadoc
	 */
	@Test
	void contextLoads() {
		String[] args = {"main","test"};
		Application.main(args);
		assertNotNull(args);
	}
    /**
     * Javadoc
     */
    @Test
    void myMethodTest() {
        myMethod();
    }

}
