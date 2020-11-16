package org.jesuitasrioja.ad1HB.persistencia;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table(name = "ciudad")
@Data @AllArgsConstructor @NoArgsConstructor
public class City implements Serializable {
	
	@Id @Column(name = "idCiudad")
	private Integer id;
	private String name;
	
	
	private Country country;
	private String district;
	private Integer population;

}
