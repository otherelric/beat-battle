package com.revature.service;

import org.springframework.stereotype.Service;

import com.revature.dao.UserDao;
import com.revature.pojo.User;

@Service
public class AuthService {
	
	UserDao userDao = new UserDao();
	
	public User validateUser(User user){
		User validUser = null;
		User uDao = userDao.getUser(user.getUsername());
		
		//System.out.println("AUTH_SERVICE: " + uDao.toString());
		
		if (user.getUsername().equals(uDao.getUsername()) && user.getPassword().equals(uDao.getPassword())){
			validUser = uDao;
		}
		return validUser;
	}
}
