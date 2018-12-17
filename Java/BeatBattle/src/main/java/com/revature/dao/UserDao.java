package com.revature.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.revature.pojo.User;
import com.revature.util.SessionUtil;

public class UserDao {
	
	public User getUser(String username) {
		Session session = SessionUtil.getSession();
		Criteria criteria = session.createCriteria(User.class);
		User user = (User) criteria.add(Restrictions.eq("username", username)).uniqueResult();
		System.out.println("userDao" + user.toString());
		return user;
	}
}
