package com.user.service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.entities.User;
import com.user.service.exceptions.ResourceNotFoundException;
import com.user.service.repositories.UserRepository;
import com.user.service.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	 private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		//generate unique userId(in this way we can generate real-time id's in projects)
		String randomUserId=UUID.randomUUID().toString();
		user.setUserId(randomUserId);
	 return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
	
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
	
		return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given id could not be found on the server!! "+userId));
	}

	
}
