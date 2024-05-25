package com.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException()
	{
		super("Resource Not Found on Sever!!");
	}	
	public ResourceNotFoundException(String message)
	{
		super(message);
	}
	
}
