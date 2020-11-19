package org.jesuitasrioja.ad1HB.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf = null;

	public static SessionFactory newSessionFactory() {

		if (sf == null) {
			sf = new Configuration().configure().buildSessionFactory();
		}

		return sf;
	}

	/**
	 * Este metodo es el encargado de utilizar el session factory ya creado para
	 * abrir una nueva sesion, esto hace que solo tengamos que cerrarla en el metodo
	 * al que queramos llamar
	 * 
	 * @return Session abierta
	 */
	public static Session createSession() {
		SessionFactory sf = HibernateUtil.newSessionFactory();
		Session s = sf.openSession();
		return s;
	}
}
