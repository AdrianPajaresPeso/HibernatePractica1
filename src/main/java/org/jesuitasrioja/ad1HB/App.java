package org.jesuitasrioja.ad1HB;

import org.jesuitasrioja.ad1HB.persistencia.City;
import org.jesuitasrioja.ad1HB.persistencia.Country;
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
		
//		persist.aniadirCiudad(ci);
		persist.aniadirPais(co);
		
		
		
		
	}
}
