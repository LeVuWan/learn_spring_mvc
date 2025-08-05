package com.windy.learnSpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.windy.learnSpringMVC.domain.User;
import com.windy.learnSpringMVC.repository.UserRepository;
import com.windy.learnSpringMVC.service.UserService;

@Controller
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/")
	public String getHompage(Model model) {
		String msg = this.userService.handleHello();
		model.addAttribute("msg", msg);
		return "hello";
	}

	@RequestMapping("/admin/user")
	public String getUserPage(Model model) {
		model.addAttribute("newAUser", new User());
		return "admin/user/create";
	}

	@RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
	public String createUserPage(Model model, @ModelAttribute("newAUser") User user) {
		User newUser = userService.createNewUser(user);
		return "hello";
	}

}
