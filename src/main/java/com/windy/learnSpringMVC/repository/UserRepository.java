package com.windy.learnSpringMVC.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.windy.learnSpringMVC.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User save(User user);
}
