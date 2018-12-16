package com.revature.service;

import org.springframework.stereotype.Service;

import com.revature.dao.UserDao;
import com.revature.pojo.User;

@Service
public class AuthService {
	
	UserDao userDao = new UserDao();
	
	public User validateUser(String usern, String passw){
		User validUser = null;
		User u = userDao.getUser(usern);
		
		if (usern.equals(u.getUsername()) && passw.equals(u.getPassword())){
			validUser = u;
		}
		return validUser;
	}
}
