package com.marcossousa.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcossousa.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User marcos = new User("1","Marcos Sousa","sousa.marcoscv@gmail.com");
		User alex = new User  ("2","Alex Green","alexGreen@gmail.com");
		User joao = new User  ("3","Joao Jose","joaoJose@gmail.com");
		
		
		return ResponseEntity.ok().body(Arrays.asList(marcos,alex,joao));

	}
		
}
