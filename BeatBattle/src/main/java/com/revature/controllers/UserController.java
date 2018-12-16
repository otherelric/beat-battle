package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.User;
import com.revature.service.AuthService;

//combines the @Controller and @RequestBody annotations
@RestController("/user")
@CrossOrigin(origins= "*")
public class UserController {
	
	@Autowired
	AuthService authServ;
	
	/*@GetMapping
	public List<User> getAllUsers(){
		return authServ.getAllUsers();
	}

	@PostMapping(consumes = "application/json")
	public void makeUser(@RequestBody User user){
		System.out.println("User: " + user);
		userService.createUser(user);
	}*/

	@GetMapping("/user/{username}/{password}")
	public User getUserByUsername(@PathVariable String username, @PathVariable String password){
		return authServ.validateUser(username, password);
	}
}
