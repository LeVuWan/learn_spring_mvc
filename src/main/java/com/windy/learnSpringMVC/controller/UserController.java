package com.windy.learnSpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.windy.learnSpringMVC.service.UserService;

@Controller
public class UserController {
	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/")
	public String getHompage() {
		return "hello";
	}

}
