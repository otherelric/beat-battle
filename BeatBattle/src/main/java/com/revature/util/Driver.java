package com.revature.util;

import org.hibernate.Session;

import com.revature.pojo.User;

public class Driver {

	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		
		User timboi = session.get(User.class, 1);
		System.out.println(timboi);
	}

}
