package com.hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entities.Hotel;
import com.hotel.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	
	//create
	@PostMapping
    public ResponseEntity<Hotel>  createHotel(@RequestBody Hotel hotel)
    {
    	Hotel hotel1=hotelService.create(hotel);
    	return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }
		
	//getAll
	@GetMapping
	public ResponseEntity<List<Hotel>> getAll()
	{
	     List<Hotel> getAll= hotelService.getAll();
	     return ResponseEntity.ok(getAll);
	}
	
	//getById
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> get(@PathVariable String hotelId)
	{
		Hotel get=hotelService.get(hotelId);
		return ResponseEntity.ok(get);
	}
		
}
