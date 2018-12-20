package com.revature.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.revature.pojo.Battle;
import com.revature.pojo.Playlist;
import com.revature.util.SessionUtil;

public class BattleDao {
	
	public List<Battle> getBattle(int id) {
		Session session = SessionUtil.getSession();
		Criteria criteria = session.createCriteria(Battle.class);
		List<Battle> listOfBattles = (List<Battle>) criteria.add(Restrictions.eq("battleid", 1)).list();
		return listOfBattles;
	}
	
	public void createBattle(Battle battle) {
		Session session = SessionUtil.getSession();
		
		Transaction t = session.beginTransaction();
		Integer newID = (Integer)session.save(battle);
		Battle newBattle = session.load(Battle.class, newID);
		t.commit();
		session.close();
		System.out.println("A new battle was made (inside battleDAO): " + newBattle);
	}
	
}
