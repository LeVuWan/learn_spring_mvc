package com.windy.learnSpringMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class LearnSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringMvcApplication.class, args);
	}

}
