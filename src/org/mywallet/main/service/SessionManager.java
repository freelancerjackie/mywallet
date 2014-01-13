package org.mywallet.main.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager {
	private static SessionFactory sessionFactory;
	private static final Logger logger = Logger.getLogger(SessionManager.class
			.getName());

	@SuppressWarnings("deprecation")
	private SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				// Create the SessionFactory from hibernate.cfg.xml
				sessionFactory = new Configuration().configure()
						.buildSessionFactory();
			} catch (Throwable ex) {
				logger.log(Level.SEVERE, ex.getMessage());
				ex.printStackTrace();
			}
		}
		return sessionFactory;
	}
	
	public Session getSession(){
		return getSessionFactory().getCurrentSession();
	}
}
