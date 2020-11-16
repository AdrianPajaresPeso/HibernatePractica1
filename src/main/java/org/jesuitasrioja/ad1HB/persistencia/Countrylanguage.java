package org.jesuitasrioja.ad1HB.persistencia;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table(name = "idiomaDePais")
@Data @NoArgsConstructor @AllArgsConstructor
public class Countrylanguage implements Serializable{
	
	@EmbeddedId
	private CountryLanguageID countryLanguageID;
	private String isOfficial;
	private Double percentage;

}
