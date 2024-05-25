package com.rating.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rating.entities.Rating;

@Service
public interface RatingService {

	
	//create
	Rating create(Rating rating);
	
	//get all ratings	
	List<Rating> getRatings();
	
	//get all by user id
	List<Rating> getRatingByUserId(String userId);
	
	//get all by hotel
	List<Rating> getRatingByHotelId(String hotelId);
	
}
