package org.jesuitasrioja.ad1HB;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jesuitasrioja.ad1HB.persistencia.City;
import org.jesuitasrioja.ad1HB.utils.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.newSessionFactory();
		Session session = sf.openSession();
		
		session.close();
	}
}
