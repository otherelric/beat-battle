package com.revature.util;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.revature.pojo.Battle;
import com.revature.pojo.User;
import com.revature.service.AuthService;

public class Driver {

	public static void main(String[] args) {
		//Session session = SessionUtil.getSession();
		
//		User timboi = session.get(User.class, 1);
//		System.out.println(timboi);
		
//		Criteria criteria = session.createCriteria(User.class);
//		User user = (User) criteria.add(Restrictions.eq("username", "emp")).uniqueResult();
//		System.out.println(user);
		
		
//		Battle timboi = session.get(Battle.class, 1);
//		System.out.println(timboi);
		
//		Criteria criteria = session.createCriteria(Battle.class);
//		List<Battle> listOfB = (List<Battle>) criteria.add(Restrictions.eq("battleid", 1)).list();
//		System.out.println(listOfB);
		
		AuthService authServ = new AuthService();
		
		Battle b = authServ.doesBattleExist(1);
		System.out.println(b);
		
	}

}
