package com.bhushan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Signup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userid;
	@NotNull
	private String firstname;
	@NotNull
	private String lastname;
	@Email(message = "Please provide a valid email address")
	@NotNull
	private String email;
	@NotNull
	private String password;
	
}
