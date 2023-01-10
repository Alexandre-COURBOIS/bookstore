package com.nfs.bookstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nfs.bookstore.models.Author;
import com.nfs.bookstore.services.AuthorService;

@RestController
@RequestMapping("api/author")
public class AuthorController {
	
	@Autowired
	private AuthorService repo;
	
	// pas top niveau qualité
	@GetMapping("")
	public List<Author> getAll() throws Exception{
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Author> get(@PathVariable(name= "id") int id){
		Author a;
		try {
			a = repo.getById(id);
		}catch (Exception e) {
			return ResponseEntity.status(500).body(null);
		}
		return ResponseEntity.ok().body(a);
	}
	
	@PostMapping("")
	public ResponseEntity<Author> add(@RequestBody Author author){
		try {
			repo.save(author);
		}catch (Exception e) {
			return ResponseEntity.status(500).body(null);
		}
		return ResponseEntity.ok().body(author);
	}
	
	@PutMapping("")
	public Author update(@RequestBody Author author) throws Exception {
		return repo.save(author);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Author> getDelete(@PathVariable(value = "id") int id) {
		repo.deleteById(id);
		// to return ok this author has been deleted, 
		//you need to return one http response with code 200 and not this author this time
		return ResponseEntity.ok().body(null);
	}

}
