package com.Deshmukh.Library.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	public String f_name;
	
	public String l_name;
	
	public int age;
	
	public String Address;
	
	public String city;
	
	public Long number;
	
	@OneToMany(targetEntity = Book.class,cascade = CascadeType.ALL)
	@JoinColumn(name="cp_fk",referencedColumnName = "id")
	public List<Book> book;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public User(String f_name, String l_name, int age, String address, String city, Long number, List<Book> book) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		this.age = age;
		Address = address;
		this.city = city;
		this.number = number;
		this.book = book;
	}



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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return city;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setCity(String city) {
		this.city = city;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}



	public List<Book> getBook() {
		return book;
	}



	public void setBooks(List<Book> book) {
		this.book = book;
	}

	

}
