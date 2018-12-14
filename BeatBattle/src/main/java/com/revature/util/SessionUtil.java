package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionUtil {

	private static SessionFactory sess;
	
	static {
		StandardServiceRegistry servReg = 
				new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.applySetting("hibernate.connection.username", System.getenv("un"))
				.applySetting("hibernate.connection.password", System.getenv("pw")).build();
		
		Metadata md = 
				new MetadataSources(servReg).getMetadataBuilder().build();
		sess = md.getSessionFactoryBuilder().build();
	}

	public static Session getSession() {
		return sess.openSession();
	}
	
}
