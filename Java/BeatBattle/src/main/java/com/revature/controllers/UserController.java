package com.revature.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.*;
import com.revature.service.*;

//combines the @Controller and @RequestBody annotations
@RestController("/user")
@CrossOrigin(origins= "*")
public class UserController {
	
	@Autowired
	AuthService authServ;
	
	@PostMapping
	public User getUser(@RequestBody User user, BindingResult bindingResult, HttpSession sess, ModelMap modelMap) {//@PathVariable String username, @PathVariable String password){
		User authUser = authServ.validateUser(user);
		
		if(authUser != null) {
			sess.setAttribute("user", authUser);
			modelMap.addAttribute("user", authUser);
		}
		//System.out.println((User)sess.getAttribute("user"));
		return (User)sess.getAttribute("user");
	}
	
}
