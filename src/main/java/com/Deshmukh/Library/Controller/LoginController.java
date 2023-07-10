package com.Deshmukh.Library.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Deshmukh.Library.Model.User;

import com.Deshmukh.Library.Services.UserService;

@RestController
public class LoginController {
	

	
	@Autowired
	public UserService userservice;
	
	@PostMapping("/login")
	public ResponseEntity<?> authUser(@RequestBody User user){
		
		return ResponseEntity.status(200).body(userservice.authenticateUser(user));
		
	}
}
