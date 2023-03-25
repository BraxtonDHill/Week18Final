package com.promineotech.film.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.film.entity.Review;
import com.promineotech.film.service.ReviewService;

@RestController
@RequestMapping("/Film_DB/reviews")
public class ReviewController {

	private ReviewService reviewService;

	public ReviewController(ReviewService reviewService) {
		super();
		this.reviewService = reviewService;
	}

	@PostMapping
	public ResponseEntity<Review> saveReview(@RequestBody Review review) {
		return new ResponseEntity<Review>(reviewService.saveReview(review), HttpStatus.CREATED);
	}
}
