package com.promineotech.film.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "film")

public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int film_id;

	@Column(name = "title")
	private String title;

	@Column(name = "release_year")
	private int release_year;

	@Column(name = "director")
	private String director;

//	 @ManyToMany(cascade = CascadeType.ALL)
//	    @JoinTable(name = "film_genre",
//	        joinColumns = @JoinColumn(name = "film_id", referencedColumnName = "id"),
//	        inverseJoinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "id"))
//	    private Set<genre> genres = new HashSet<>();
//	
// adding this to film and genre when I make the junction table?
	
}
