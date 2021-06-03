package com.marcossousa.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.marcossousa.workshopmongo.domain.User;
import com.marcossousa.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User miguel = new User(null, "Miguel Alves", "m4xsousa@gmail.com");
		User meire = new User(null, "Merilania Maria", "meire1982@gmail.com");
		User mariana = new User(null, "Mariana Alves", "marimari@gmail.com");
		
		
		userRepository.saveAll(Arrays.asList(miguel,meire,mariana));
	
		
	}

	
}
