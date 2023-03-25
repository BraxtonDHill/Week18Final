package com.promineotech.film.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.film.Repository.FilmRepository;
import com.promineotech.film.entity.Film;
import com.promineotech.film.exception.ResourceNotFoundException;

@Service
public class FilmServiceImpl implements FilmService {
	
	@Autowired
	private FilmRepository filmRepository;

	
	public FilmServiceImpl(FilmRepository filmRepository) {
		super();
		this.filmRepository = filmRepository;
	}

	// SAVE a film, POST
	@Override
	public Film saveFilm(Film film) {

		return filmRepository.save(film);
	}

	// GET a list of all films
	@Override
	public List<Film> getAllfilms() {
		return filmRepository.findAll();
	}

	@Override
	public Film getByFilmID(int Id) {
		return filmRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Film", "ID", Id));

	}

	@Override
	public Film updateFilm(Film films, int Id) {
		Film existingFilms = filmRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Film", "ID", Id));

		existingFilms.setDirector(films.getDirector());
		existingFilms.setRelease_year(films.getRelease_year());
		existingFilms.setTitle(films.getTitle());

		filmRepository.save(existingFilms);
		return existingFilms;
	}

	@Override
	public void deleteFilm(int Id) {
		Film existingFilms = filmRepository.findById(Id)
				.orElseThrow(() -> new ResourceNotFoundException("Film", "ID", Id));
		filmRepository.deleteById(Id);
	}

}
