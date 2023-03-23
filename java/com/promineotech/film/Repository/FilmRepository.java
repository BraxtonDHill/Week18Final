package com.promineotech.film.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.promineotech.film.entity.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {

	Optional<Film> findbyId(int Id);

	Film save(Film film);

	void deleteById(int id);
// from suggestions, not sure if this is correct

}
