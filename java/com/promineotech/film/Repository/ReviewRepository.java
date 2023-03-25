package com.promineotech.film.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promineotech.film.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
	

}
