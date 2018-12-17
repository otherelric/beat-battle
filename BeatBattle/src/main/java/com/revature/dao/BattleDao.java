package com.revature.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.revature.pojo.Battle;
import com.revature.util.SessionUtil;

public class BattleDao {
	
	public Battle getBattle(int id) {
		Session session = SessionUtil.getSession();
		Criteria criteria = session.createCriteria(Battle.class);
		Battle battle = (Battle) criteria.add(Restrictions.eq("battleid", id)).uniqueResult();
		return battle;
	}
	
}
