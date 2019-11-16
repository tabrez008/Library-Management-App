package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Author;

public interface AuthorRepo extends JpaRepository<Author, Integer>{

}
