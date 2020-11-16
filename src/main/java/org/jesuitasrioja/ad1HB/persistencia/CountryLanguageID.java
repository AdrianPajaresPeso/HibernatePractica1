package org.jesuitasrioja.ad1HB.persistencia;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;


@Embeddable
public class CountryLanguageID implements Serializable{
	
	private String language;

	@ManyToOne
	private Country country;
}
