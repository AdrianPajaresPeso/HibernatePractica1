package org.jesuitasrioja.ad1HB.persistencia;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;

@Entity @Table(name = "City")
@Data @AllArgsConstructor @NoArgsConstructor @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class City implements Serializable {
	
	@Id @Include
	private Integer id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Country country;
	private String district;
	private Integer population;

}
