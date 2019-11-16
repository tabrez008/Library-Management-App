package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
