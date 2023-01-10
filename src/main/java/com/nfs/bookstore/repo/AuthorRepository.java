package com.nfs.bookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nfs.bookstore.models.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer>{
	// get, get all, update, add, delete
	Author findByLastnameAndFirstname(String lastname, String firstname);
}
