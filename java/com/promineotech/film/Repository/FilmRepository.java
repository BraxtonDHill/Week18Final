package com.promineotech.film.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promineotech.film.entity.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {

}
