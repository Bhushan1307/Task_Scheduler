package com.bhushan.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhushan.model.Signup;
import com.bhushan.service.SignupService;

@RestController
public class SignupController {

	@Autowired
	SignupService ss;
	
	@PostMapping("/register")
	public String register(@RequestBody @Valid Signup signup) {
		return ss.register(signup);
	}
	
	@GetMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password) {
		return ss.login(email,password);
	}
	
	
}
