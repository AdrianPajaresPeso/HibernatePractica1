package org.jesuitasrioja.ad1HB;

import java.util.ArrayList;

import org.jesuitasrioja.ad1HB.persistencia.City;
import org.jesuitasrioja.ad1HB.persistencia.Country;
import org.jesuitasrioja.ad1HB.persistencia.CountryLanguageID;
import org.jesuitasrioja.ad1HB.persistencia.Countrylanguage;
import org.jesuitasrioja.ad1HB.persistencia.IPersistencia;
import org.jesuitasrioja.ad1HB.persistencia.PersistenciaHB;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		IPersistencia persist = new PersistenciaHB();
		
		City ci = new City(1,"Elchea", null, "Distrito esmeralda", 66181684);
		Country co = new Country("DBO","Disborad", "Europa", "region1", 513.6,84,81,358.168, 651.6,651.5,"asd", "juego", "Tet", ci, "c2", null);

		ci.setCountry(co);
		
		CountryLanguageID cli = new CountryLanguageID("NGNL", co);
		Countrylanguage cl = new Countrylanguage(cli, "T", 75.5);
		ArrayList<Countrylanguage> listaIdiomas = new ArrayList<>();
		listaIdiomas.add(cl);
		
		co.setListOfLanguages(listaIdiomas);
		
		

//			persist.aniadirCiudad(ci);
//			persist.aniadirPais(co);	
		
		
		System.out.println(persist.cambiarNombreCiudad(1, "Elchea"));
		System.out.println(persist.listaCiudades());
		
		
		System.out.println(persist.listaPaises());
		
		System.out.println(persist.existeCiudad(1));
		System.out.println(persist.existePais("DBO"));
		System.out.println(persist.getCountry("DBO"));
		System.out.println(persist.listaCiudades("Disborad"));
		System.out.println(persist.getPaisDeCiudad(1));
		

		System.out.println(persist.estaCiudadEnPais(1, "DBO"));
		System.out.println(persist.estaCiudadEnPais(1, "DBOs"));
		
		System.out.println(persist.getCity(1));
		
		System.out.println(persist.cambiarNombreCiudad(1, "patata"));
		System.out.println(persist.cambiarNombreCiudad(1, "patata"));
		System.out.println(persist.getCity(1));
		
		System.out.println(persist.getAllLanguages());
		System.out.println(persist.listaIdiomas("DBO"));
		
		
	}
}
