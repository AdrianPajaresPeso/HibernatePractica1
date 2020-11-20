package org.jesuitasrioja.ad1HB.persistencia;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.ToString.Exclude;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryLanguageID implements Serializable {

	private String language;

	@ManyToOne @Exclude
	private Country country;
}
