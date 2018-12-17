package com.revature.util;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.revature.pojo.User;

public class Driver {

	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		
//		User timboi = session.get(User.class, 1);
//		System.out.println(timboi);
		
		Criteria criteria = session.createCriteria(User.class);
		User user = (User) criteria.add(Restrictions.eq("username", "emp")).uniqueResult();
		System.out.println(user);
	}

}
