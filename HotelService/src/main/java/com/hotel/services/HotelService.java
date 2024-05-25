package com.hotel.services;


import java.util.List;

import com.hotel.entities.Hotel;

public interface HotelService {
	
	
	//create a hotel	
	Hotel create(Hotel hotel);
	
    //get all	
	List<Hotel> getAll();
	
	//getById	
	Hotel get(String id);
	
}
