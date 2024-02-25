package model.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.entities.User;


//Idicates that this class is a Rest controller
@RestController
//EndPoint = is a specific URL that represents a resource or functionality of a system.
@RequestMapping(value = "/users") 
public class UserResource {

	//ResponseEntity = Represents HTTP response
	//Maps HTTP GET requests to specific methods in a controller
	@GetMapping
	public ResponseEntity<User> findAll(){
		System.out.println("Endpoint /users foi acessado.");
		User u = new User(1L, "Maria", "maria@gmail.com", "21972892504", "12345");
		return ResponseEntity.ok().body(u);
	}
}
