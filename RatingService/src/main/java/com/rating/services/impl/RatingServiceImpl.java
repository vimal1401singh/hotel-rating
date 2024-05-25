package com.rating.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.entities.Rating;
import com.rating.repositories.RatingRepo;
import com.rating.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService  {

	@Autowired
    RatingRepo ratingRepo;
		
	
	@Override
	public Rating create(Rating rating) {
		  String randomRatingId=UUID.randomUUID().toString();
		  rating.setRatingId(randomRatingId);
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getRatings() {		
		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		
		return ratingRepo.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		
		return ratingRepo.findByHotelId(hotelId);
	}

	
}
