package com.Deshmukh.Library.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class IssuedBook {

	public String f_name;
	
	public String l_name;
	
	public String Author_name; 
	
	public String Book_name;
	


	
	
	public IssuedBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public IssuedBook(String f_name, String l_name, String author_name, String book_name) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		Author_name = author_name;
		Book_name = book_name;
	}

	public int price;

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	

	public String getL_name() {
		return l_name;
	}


	public void setL_name(String l_name) {
		this.l_name = l_name;
	}


	public String getAuthor_name() {
		return Author_name;
	}


	public void setAuthor_name(String author_name) {
		Author_name = author_name;
	}


	public String getBook_name() {
		return Book_name;
	}

	public void setBook_name(String book_name) {
		Book_name = book_name;
	}

	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
