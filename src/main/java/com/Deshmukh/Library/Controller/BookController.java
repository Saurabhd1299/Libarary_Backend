package com.Deshmukh.Library.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Deshmukh.Library.Exception.ResourceNotDFound;
import com.Deshmukh.Library.Model.Book;
import com.Deshmukh.Library.Repository.BookRepository;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	public BookRepository bookrepository;
	
	
	@PostMapping("/add")
	public Book createBook(@PathVariable Book book) {
		return bookrepository.save(book);
	}
	
	@GetMapping("/show")
	public List<Book> getAllBook(){
		return bookrepository.findAll();
	}
	
	@GetMapping("/show/{id}")
	public Book getbookbyid(@PathVariable Integer id) {
		
		return bookrepository.findById(id).orElseThrow();
	}
	
	@PostMapping("/update/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Integer id, @RequestBody Book bookdetails){
		
		Book book=bookrepository.findById(id).orElseThrow(()-> new ResourceNotDFound("Book Not Found"+id));
		
		book.setAuthor_name(bookdetails.getAuthor_name());
		book.setBook_name(bookdetails.getBook_name());
		book.setPrice(bookdetails.getPrice());
		
		Book updatebook=bookrepository.save(book);
		
		
		return ResponseEntity.ok(updatebook);
		
	}
	
	
}
