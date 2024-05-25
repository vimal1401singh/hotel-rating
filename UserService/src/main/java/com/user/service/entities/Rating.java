package com.user.service.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
	@Id
	private String ratinngId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
    
}
