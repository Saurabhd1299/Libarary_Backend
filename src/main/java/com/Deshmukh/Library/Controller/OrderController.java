package com.Deshmukh.Library.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Deshmukh.Library.Model.User;
import com.Deshmukh.Library.Repository.BookRepository;
import com.Deshmukh.Library.Repository.UserRepository;

import com.Deshmukh.Library.dto.IssuedBook;
import com.Deshmukh.Library.dto.RequestBook;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public BookRepository bookrepository;
	
  
//	@PostMapping("/add")
//	public User placeorder(@RequestBody RequestBook requestbook) {
//		
//		return userRepository.save(requestbook.user);
//	}
//	
	 @GetMapping("/findAllOrders")
	    public List<User> findAllOrders(){
	        return userRepository.findAll();
	    }
	    
	    @GetMapping("/getInfo")
	    public List<IssuedBook> getJoinInformation(){
	        return userRepository.getJoinInformation();
	    }
}
