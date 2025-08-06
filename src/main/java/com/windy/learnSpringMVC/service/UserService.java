package com.windy.learnSpringMVC.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.windy.learnSpringMVC.domain.User;
import com.windy.learnSpringMVC.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User createNewUserService(User user) {
		return userRepository.save(user);
	}

	public List<User> findAllUsersService() {
		return this.userRepository.findAll();
	}

	public String handleHello() {
		return "Hello from service";
	}
}
