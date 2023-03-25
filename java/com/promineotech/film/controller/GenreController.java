package com.promineotech.film.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.film.entity.genre;
import com.promineotech.film.service.GenreService;

@RestController
@RequestMapping("/Film_DB/genres")
public class GenreController {

	@Autowired
	private GenreService genreService;

	public GenreController(GenreService genreService) {
		super();
		this.genreService = genreService;
	}

	// get all genres
	@GetMapping
	public List<genre> getAllGenres() {
		return genreService.getAllGenres();
	}
}
