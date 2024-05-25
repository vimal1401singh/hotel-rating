package com.user.service.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "micro_users")
public class User {
	
	@Id
	@Column(name="ID")
	private String userId;
	@Column(name="NAME")
	private String name;
	@Column(name="E_MAIL")
	private String email;
	@Column(name="ABOUT")
	private String about;

	// The transient keyword is a variable modifier in Java used in the
	//context of serialization. When applied to a variable, it instructs the Java 
	//Virtual Machine (JVM) to exclude that variable from the serialization process. 
	//Transient variables are not saved in the serialized form of the object.
    // is field ko save anhi karega database me.
	
	@Transient 
	private List<Rating> ratings=new ArrayList<Rating>();
	
	

}
