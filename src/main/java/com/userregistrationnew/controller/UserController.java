package com.userregistrationnew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userregistrationnew.entities.User;
import com.userregistrationnew.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/home")
	public String Signup() {
		return "welcome to the user registration page";
	}
	
	
	//get the courses
	@GetMapping("/users")
	public List<User> getUsers(){
		
		return this.userservice.getUsers();
	}
	
	
	
	//get the user by its user id
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable String userId) {
		return this.userservice.getUser(Long.parseLong(userId));
	}

	
	
	//add the user 
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return this.userservice.addUser(user);
	}
}
