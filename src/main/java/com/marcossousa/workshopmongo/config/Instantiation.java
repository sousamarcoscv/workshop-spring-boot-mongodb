package com.marcossousa.workshopmongo.config;

import java.text.SimpleDateFormat;

import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;


import com.marcossousa.workshopmongo.domain.Post;
import com.marcossousa.workshopmongo.domain.User;
import com.marcossousa.workshopmongo.dto.AuthorDTO;
import com.marcossousa.workshopmongo.repository.PostRepository;
import com.marcossousa.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User miguel = new User(null, "Miguel Alves", "m4xsousa@gmail.com");
		User meire = new User(null, "Merilaia Maria", "meire1982@gmail.com");
		User mariana = new User(null, "Mariana Alves", "marimari@gmail.com");
	
		userRepository.saveAll(Arrays.asList(miguel,meire,mariana));
	
		Post post1 = new Post(null,sdf.parse("21/03/2018"),"Partiu Viagem", "Vou viajar para SP abraços!",new AuthorDTO(mariana));
		Post post2 = new Post(null,sdf.parse("15/03/2018"),"Bom dia", "Acordei Feliz Hoje!",new AuthorDTO(mariana));
	
		postRepository.saveAll(Arrays.asList(post1,post2));
		
		mariana.getPosts().addAll(Arrays.asList(post1,post2));
		userRepository.save(mariana);

	}

	
}
