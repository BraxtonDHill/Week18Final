package com.promineotech.film.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promineotech.film.entity.genre;

@Repository
public interface GenreRepository extends JpaRepository<genre, Integer> {
}