package com.nfs.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nfs.bookstore.models.Author;
import com.nfs.bookstore.repo.AuthorRepository;

@Service
public class AuthorService {

	
	@Autowired
	private AuthorRepository repo;
	
	public List<Author> findAll() throws Exception{
		return repo.findAll();		
	}
	
	public Author getById(int id) throws Exception{
		return repo.findById(id).get();		
	}

	
	public Author save(Author a) throws Exception{
		return repo.save(a);		
	}

	
	public boolean deleteById(int id){
		try {
			repo.deleteById(id);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}