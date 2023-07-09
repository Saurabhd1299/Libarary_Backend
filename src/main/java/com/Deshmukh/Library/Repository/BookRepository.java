package com.Deshmukh.Library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Deshmukh.Library.Model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
