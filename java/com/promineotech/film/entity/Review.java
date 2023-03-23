package com.promineotech.film.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Data;

@Entity
@Data

public class Review {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "comment")
	private String comment;

	@Column(name = "rating")
	private int rating;

	@ManyToOne
    @JoinColumn(name="film_id")
    private Film film;
}
