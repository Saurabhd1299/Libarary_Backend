package com.Deshmukh.Library.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.Deshmukh.Library.Model.User;
import com.Deshmukh.Library.dto.IssuedBook;



public interface UserRepository extends JpaRepository<User, Integer>{

		public List<User> findByCity(String city);
		
		//@Query("SELECT c.f_name, p.Book_name FROM User c JOIN c.book p")
		 @Query("SELECT new com.Deshmukh.Library.dto.IssuedBook(c.f_name, c.l_name,p.Author_name,p.Book_name) FROM User c JOIN c.book p")
		 public List<IssuedBook> getJoinInformation();
		 
		

		public User findByf_name(String f_name);

}
