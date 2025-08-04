package com.windy.learnSpringMVC;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController()
public class HelloWorldController {
	@GetMapping("/")
	public String index() {
		return "Hello World 123";
	}

	@GetMapping("/user")
	public String userPage() {
		return "Only user";
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		return "Only admin";
	}
}
