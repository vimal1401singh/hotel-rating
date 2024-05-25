package com.user.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.entities.User;
import com.user.service.services.UserService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;// in this userService we will save the user

	// in order to receive all data from user in j-son we use r using @RequestBody
	// here all the data will be de-serialized(json ka object convert ho jaega user
	// ke object me)
	// ResponseEntity represents the whole HTTP response: status code, headers, and
	// body. it is a generic type

	// create an user:-

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}

	// get single user:-

	@GetMapping("/{userId}") // The @PathVariable annotation is used to retrieve data from the URL path. By
								// defining place-holders in the request mapping URL
	public ResponseEntity<User> getSingleUser(@PathVariable String userId) {
		User user = userService.getUser(userId);
		return ResponseEntity.ok(user);
	}
          
	
	// get all users:-
	@GetMapping
	public ResponseEntity<List<User>> getAllUser() {
		List<User> allUser = userService.getAllUser();
		return ResponseEntity.ok(allUser);
	}
}
