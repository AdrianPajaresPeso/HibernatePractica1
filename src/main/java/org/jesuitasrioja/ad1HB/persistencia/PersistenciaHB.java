package org.jesuitasrioja.ad1HB.persistencia;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.jesuitasrioja.ad1HB.utils.HibernateUtil;

public class PersistenciaHB implements IPersistencia {

	@Override
	public Set<City> listaCiudades() {
		Set<City> returnSet = null;
		Session s = HibernateUtil.createSession();

		Query q = s.createQuery("from City");
		returnSet = new HashSet<City>(q.getResultList());
		s.close();
		return returnSet;
	}

	@Override
	public Set<Country> listaPaises() {

		Session s = HibernateUtil.createSession();

		Query q = s.createQuery("from Country");

		Set<Country> setPaises = new HashSet<>(q.getResultList());
		s.close();
		return setPaises;
	}

	@Override
	public Boolean existeCiudad(Integer codigoCiudad) {
		Boolean flag = false;
		Session s = HibernateUtil.createSession();

		if (s.get(City.class, codigoCiudad) != null) {
			flag = true;
		}

		s.close();
		return flag;
	}

	@Override
	public Boolean existePais(String codigoPais) {
		Boolean flag = false;
		Session s = HibernateUtil.createSession();

		if (s.get(Country.class, codigoPais) != null) {
			flag = true;
		}

		s.close();
		return flag;
	}

	@Override
	public City getCity(Integer codigoCiudad) {
		City c = null;
		Session s = HibernateUtil.createSession();

		c = s.get(City.class, codigoCiudad);

		s.close();
		return c;
	}

	@Override
	public Country getCountry(String codigoPais) {
		Country co = null;
		Session s = HibernateUtil.createSession();

		s.get(Country.class, codigoPais);
		s.close();
		return co;
	}

	@Override
	public Set<City> listaCiudades(String nombrePais) {
		Set<City> setRetorno = null;
		Session s = HibernateUtil.createSession();

		Query q = s.createQuery("from City as ci where ci.country.name = :countryName");
		q.setParameter("countryName", nombrePais);

		setRetorno = new HashSet<>(q.getResultList());
		s.close();

		return setRetorno;
	}

	@Override
	public Country getPaisDeCiudad(Integer codigoCiudad) {
		Session s = HibernateUtil.createSession();
		City c = s.get(City.class, codigoCiudad);
		Country co = c.getCountry();

		s.close();
		return co;
	}

	@Override
	public Boolean estaCiudadEnPais(Integer codigoCiudad, String codigoPais) {

		Boolean flag = false;
		Session s = HibernateUtil.createSession();
		City c = s.get(City.class, codigoCiudad);
		if (c.getCountry().getCode().equals(codigoPais)) {
			flag = true;
		}

		s.close();

		return flag;
	}

	@Override
	public Boolean cambiarNombreCiudad(Integer codigoCiudad, String nuevoNombre) {
		Boolean flag = false;
		Session s = HibernateUtil.createSession();
		Transaction t = s.beginTransaction();

		City city = s.get(City.class, codigoCiudad);
		if (!nuevoNombre.equals(city.getName())) {
			flag = true;
		}

		city.setName(nuevoNombre);
		s.update(city);

		t.commit();

		s.close();

		return flag;
	}

	@Override
	public void aniadirCiudad(City nuevaCiudad) {
		Session s = HibernateUtil.createSession();
		Transaction t = s.beginTransaction();

		s.save(nuevaCiudad);

		t.commit();
		s.close();
	}

	@Override
	public void aniadirPais(Country nuevoPais) {
		Session s = HibernateUtil.createSession();
		Transaction t = s.beginTransaction();

		s.save(nuevoPais);

		t.commit();
		s.close();

	}

	@Override
	public List<Countrylanguage> getAllLanguages() {
		List<Countrylanguage> listaRetorno = null;
		Session s = HibernateUtil.createSession();

		Query q = s.createQuery("from Countrylanguage");
		listaRetorno = q.getResultList();
		s.close();
		return listaRetorno;
	}

	@Override
	public Set<Countrylanguage> listaIdiomas(String codigoPais) {
		Set<Countrylanguage> setRetorno = null;
		Session s = HibernateUtil.createSession();

		Query q = s.createQuery("from Countrylanguage cl where cl.countryLanguageID.country.code = :code");
		q.setParameter("code", codigoPais);
		setRetorno = new HashSet<>(q.getResultList());

		s.close();
		return setRetorno;
	}

}
