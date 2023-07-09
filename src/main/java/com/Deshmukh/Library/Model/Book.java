package com.Deshmukh.Library.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int bid;
	
	public String Author_name;
	
	public String Book_name;
	
	public int price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String author_name, String book_name, int price) {
		super();
		Author_name = author_name;
		Book_name = book_name;
		this.price = price;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
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
