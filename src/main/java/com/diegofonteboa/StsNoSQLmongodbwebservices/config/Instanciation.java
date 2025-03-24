package com.diegofonteboa.StsNoSQLmongodbwebservices.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.diegofonteboa.StsNoSQLmongodbwebservices.domain.User;
import com.diegofonteboa.StsNoSQLmongodbwebservices.repository.UserRepository;

@Configuration
public class Instanciation implements CommandLineRunner {
	

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();   //zerando aqui
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");  //o bd gera o id.
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
	}

}
