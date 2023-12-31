package com.Deshmukh.Library.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Deshmukh.Library.Model.User;
import com.Deshmukh.Library.Repository.UserRepository;

@Service
public class UserService {

		@Autowired
		public UserRepository userrepository;
		
		
		public List<User> getuserByCity(String city){
			return userrepository.findByCity(city);
		}
		
		public User authenticateUser(User user) {
			User opUser = userrepository.findByf_name(user.getF_name());
			if(opUser.getNumber().equals(user.getNumber())) {
				return opUser;
			}
			return null;
		}
		
}
