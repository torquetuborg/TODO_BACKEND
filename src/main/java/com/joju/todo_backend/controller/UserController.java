package com.joju.todo_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.joju.todo_backend.model.User;
import com.joju.todo_backend.repository.UserRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/user")
	User saveNewUser(@RequestBody User newUser) {
		return userRepository.save(newUser);
	}
	@GetMapping("/users")
    List<User> getAllUsers(){
		return userRepository.findAll();
	}
}
