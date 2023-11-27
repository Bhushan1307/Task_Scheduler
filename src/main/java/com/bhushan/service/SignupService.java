package com.bhushan.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.dao.SignupRepository;
import com.bhushan.model.Signup;

@Service
public class SignupService {

	@Autowired
	SignupRepository sr;

	public String register(@Valid Signup signup) {
	
		Optional<Signup> sg = sr.findByEmail(signup.getEmail());
		
		if(signup.getFirstname().isEmpty())
			return "enter first name";
		else if(signup.getLastname().isEmpty())
			return "enter last name";
		else if(signup.getEmail().isEmpty())
			return "email is not present";
		else if(signup.getPassword().isEmpty())
			return "Password is not present";
		else if(sg.isPresent())
			return "User is already present";
		else
			 sr.save(signup);
			 return "User registration successful!!";
	}

	public String login(String email, String password) {
		Optional<Signup> sg = sr.findByEmail(email);
		
		if(sg.isPresent())
			if(sg.get().getPassword().contentEquals(password))
				return "User login successfull";
			else
				return "Please check the password";
		else
			return "User is not available please signup";
	}
}
