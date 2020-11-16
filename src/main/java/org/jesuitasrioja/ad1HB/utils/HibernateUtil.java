package org.jesuitasrioja.ad1HB.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf = null; 
	
	public static SessionFactory newSessionFactory() {
		
		if(sf == null) {
			sf = new Configuration().configure().buildSessionFactory();
		}
		
		return sf;
	}
}
