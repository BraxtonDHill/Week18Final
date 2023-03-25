package com.promineotech.film.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.film.Repository.GenreRepository;
import com.promineotech.film.entity.genre;


@Service
public class GenreServiceImpl implements GenreService {
	
	 @Autowired
    GenreRepository genreRepository;

    public GenreServiceImpl(GenreRepository genreRepository) {
        super();
        this.genreRepository = genreRepository;
    }

    // get all genres
    @Override
    public List<genre> getAllGenres() {
        return genreRepository.findAll();
    }
}