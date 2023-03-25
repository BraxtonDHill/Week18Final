package com.promineotech.film.service;

import java.util.List;

import com.promineotech.film.entity.Film;
import com.promineotech.film.entity.Review;

public interface FilmService {
	//save films, POST
	Film saveFilm(Film film);
	
	//get a list of films, GET
	List<Film> getAllfilms();
	
	//get a film by ID, GET
	Film getByFilmID(int Id);
	
	//Update a film, PUT
	Film updateFilm(Film film, int Id);
	
	//Delete a film. DELETE
	void deleteFilm(int Id);
}
