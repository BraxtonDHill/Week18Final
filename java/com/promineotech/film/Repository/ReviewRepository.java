package com.promineotech.film.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.promineotech.film.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

	Review save(Review review);

}
