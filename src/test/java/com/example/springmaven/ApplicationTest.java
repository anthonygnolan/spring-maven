package com.example.springmaven;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;
import static com.example.springmaven.Application.myMethod;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Javadoc
 */
@Suite
@SuiteDisplayName("Junit first test suite")
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
    @DisplayName("My method Test")
    void myMethodTest() {
        myMethod();
    }

    @Nested
    @DisplayName("equality is based on values")
    class Equality {
        @Test
        @DisplayName("My method Test")
        void myMethodTest() {
            myMethod();
        }
    }

}
