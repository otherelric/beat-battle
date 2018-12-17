package com.revature.service;

import org.springframework.stereotype.Service;

import com.revature.dao.UserDao;
import com.revature.pojo.User;

@Service
public class AuthService {
	
	UserDao userDao = new UserDao();
	
	public User validateUser(User user){
		User validUser = null;
		User u = userDao.getUser(user.getUsername());
		
		if (user.getUsername().equals(u.getUsername()) && user.getPassword().equals(u.getPassword())){
			validUser = user;
		}
		return validUser;
	}
}
