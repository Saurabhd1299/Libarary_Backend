package com.Deshmukh.Library.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.Deshmukh.Library.Exception.ResourceNotDFound;
import com.Deshmukh.Library.Model.User;
import com.Deshmukh.Library.Repository.UserRepository;
import com.Deshmukh.Library.Services.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	public UserRepository userrepository;
	
	
	@PostMapping("/add")
	public User createUser(@RequestBody User user) {
		
		return userrepository.save(user);
	}
	
	@GetMapping("/show")
	public List<User> getAllUser(){
		return userrepository.findAll();
	}
	
	@GetMapping("/show/{id}")
	public User getUserById(@PathVariable Integer id){
		 return userrepository.findById(id).orElseThrow();
	}
	

	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteAllUser(@PathVariable Integer id){
		User user=userrepository.findById(id).orElseThrow(()-> new ResourceNotDFound("User Not Found"+id));
			
		userrepository.delete(user);
		
		Map<String, Boolean> response=new HashMap<>();
		
		response.put("Deleted", Boolean.TRUE);
		
		return ResponseEntity.ok(response);
		
	}
	
	
	@PutMapping("/update/{id}")
	
	public ResponseEntity<User> updateuUser(@PathVariable Integer id,@RequestBody User userdetails){
		
		User user=userrepository.findById(id).orElseThrow(()-> new ResourceNotDFound("User Not Found"+id));

		user.setF_name(userdetails.getF_name());
		user.setL_name(userdetails.getL_name());
		user.setNumber(userdetails.getNumber());
		user.setCity(userdetails.geCity());
		user.setAddress(userdetails.getAddress());
		user.setAge(userdetails.getAge());
		
		User updateUser = userrepository.save(user);
		
		return ResponseEntity.ok(updateUser);
	
	}
	
	@Autowired
	public UserService userservice;
	
	@GetMapping("/use/{city}")
	public List<User> getuserByCity(@PathVariable String city){
		return userservice.getuserByCity(city);
	}
}
