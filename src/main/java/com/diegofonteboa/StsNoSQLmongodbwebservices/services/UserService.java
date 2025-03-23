package com.diegofonteboa.StsNoSQLmongodbwebservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegofonteboa.StsNoSQLmongodbwebservices.domain.User;
import com.diegofonteboa.StsNoSQLmongodbwebservices.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
