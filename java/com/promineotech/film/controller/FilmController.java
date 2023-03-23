package com.promineotech.film.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.film.entity.Film;
import com.promineotech.film.service.FilmService;

@RestController
@RequestMapping("/Film_DB/films")
public class FilmController {

	private FilmService filmService;

	public FilmController(FilmService filmService) {
		super();
		this.filmService = filmService;
	}

	// create a film
	@PostMapping
	public ResponseEntity<Film> saveFilms(@RequestBody Film film) {
		return new ResponseEntity<Film>(filmService.saveFilm(film), HttpStatus.CREATED);
	}

	// get all films
	@GetMapping
	public List<Film> getAllfilms() {
		return filmService.getAllfilms();
	}

	@GetMapping("{film_id}")
	public ResponseEntity<Film> getByFilmId(@PathVariable("film_id") int filmId) {
		return new ResponseEntity<Film>(filmService.getByFilmID(filmId), HttpStatus.CREATED);
	}

	@PutMapping("{film_id}")
	public ResponseEntity<Film> updateFilmId(@PathVariable("film_id") int filmId, @RequestBody Film film) {
		return new ResponseEntity<Film>(filmService.updateFilm(film, filmId), HttpStatus.OK);
	}

	@DeleteMapping("{film_id}")
	public ResponseEntity<String> deleteFilm(@PathVariable("film_id") int filmId) {
		filmService.deleteFilm(filmId);
		return new ResponseEntity<String>("Film deleted", HttpStatus.OK);
	}
}
