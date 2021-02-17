package com.simplilearn.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.sportyshoes.entity.User;
import com.simplilearn.sportyshoes.exception.UserNotFound;
import com.simplilearn.sportyshoes.repository.UserRepository;

@RestController
@RequestMapping
public class UserController {
	
	//inject dependencies
	@Autowired
	private UserRepository userRepository;
	
	
	//get all users
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return this.userRepository.findAll();
	}
	
	//get user by id
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable(value="id") int id) {
		return this.userRepository.findById(id)
				.orElseThrow(() -> new UserNotFound("User not Found With Id " + id));
	}
	
	//Create User
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return this.userRepository.save(user);
	}

}
