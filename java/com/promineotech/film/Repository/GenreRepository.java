package com.promineotech.film.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.promineotech.film.entity.genre;

public interface GenreRepository extends JpaRepository<genre, Integer> {
}