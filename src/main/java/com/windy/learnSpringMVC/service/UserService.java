package com.windy.learnSpringMVC.service;

import org.springframework.stereotype.Service;

import com.windy.learnSpringMVC.domain.User;
import com.windy.learnSpringMVC.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository ;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User createNewUser(User user) {
		return userRepository.save(user);
	}

	public String handleHello() {
		return "Hello from service";
	}
}
