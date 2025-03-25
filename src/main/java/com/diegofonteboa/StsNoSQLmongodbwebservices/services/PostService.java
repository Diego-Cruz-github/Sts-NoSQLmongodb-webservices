package com.diegofonteboa.StsNoSQLmongodbwebservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegofonteboa.StsNoSQLmongodbwebservices.domain.Post;
import com.diegofonteboa.StsNoSQLmongodbwebservices.repository.PostRepository;
import com.diegofonteboa.StsNoSQLmongodbwebservices.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);
	}
}
	
