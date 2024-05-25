package com.user.service.services;

import java.util.List;

import com.user.service.entities.User;

public interface UserService {
	
	
	// user operations
	
	//creating  a method to create user	
	User saveUser(User user);
	
	// get all user
	List<User> getAllUser();
	
	//get single user of given UserId;
	User getUser(String userId);	
	

}
