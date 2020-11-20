package org.jesuitasrioja.ad1HB.persistencia;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;
import lombok.ToString.Exclude;


@Entity @Table(name = "Country")
@Data @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Country implements Serializable{
	
	@Id @Include
	private String code;
	private String name;
	private String continent;
	private String region;
	private Double surfaceArea;
	private Integer indepYear;
	private Integer population;
	private Double lifeExpectancy;
	private Double gnp;
	private Double gnpOld;
	private String localName;
	private String governmentForm;
	private String headOfState;
	
	@OneToOne(cascade = CascadeType.ALL)
	private City capital;
	private String code2;
	
	@OneToMany(mappedBy = "countryLanguageID.country", cascade = CascadeType.ALL, fetch = FetchType.EAGER ) 
	List<Countrylanguage> listOfLanguages;

}
//, fetch = FetchType.EAGER