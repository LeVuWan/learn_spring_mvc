package com.windy.learnSpringMVC.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public String handleHello() {
		return "Hello from service";
	}
}
