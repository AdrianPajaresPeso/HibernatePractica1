package org.jesuitasrioja.ad1HB.persistencia;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.jesuitasrioja.ad1HB.utils.HibernateUtil;

public class PersistenciaHB implements IPersistencia{

	
	
	@Override
	public Set<City> listaCiudades() {
		Set<City> returnSet = null;
		Session s = HibernateUtil.createSession();
		
		Query q = s.createQuery("Select * from ciudad");

		returnSet = new HashSet<>(q.getResultList());
		s.close();
		return returnSet;
	}

	@Override
	public Set<Country> listaPaises() {
		Set<Country> setPaises = null;
		Session s = HibernateUtil.createSession();
		
		Query q = s.createQuery("Select * from pais");
		
		setPaises = new HashSet<>(q.getResultList());
		s.close();
		return setPaises;
	}

	@Override
	public Boolean existeCiudad(Integer codigoCiudad) {
		Boolean flag = false;
		Session s = HibernateUtil.createSession();
		
		
		
		s.close();
		return flag;
	}

	@Override
	public Boolean existePais(String codigoPais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public City getCity(Integer codigoCiudad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country getCountry(String codigoPais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<City> listaCiudades(String nombrePais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country getPaisDeCiudad(Integer codigoCiudad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean estaCiudadEnPais(Integer codigoCiudad, String codigoPais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cambiarNombreCiudad(Integer codigoCiudad, String nuevoNombre) {
		// TODO Auto-generated method stub
		return null;
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
		
		s.close();
		return listaRetorno;
	}

	@Override
	public Set<Countrylanguage> listaIdiomas(String codigoPais) {
		
		return null;
	}
	
	

}
