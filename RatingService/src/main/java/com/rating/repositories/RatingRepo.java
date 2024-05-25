package com.rating.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.entities.Rating;

public interface RatingRepo extends JpaRepository<Rating, String> {

	//Custom finder methods
	List<Rating> findByUserId( String userId);
	
	List<Rating> findByHotelId(String hotelId);
	
	
	
	
}
