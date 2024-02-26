package demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.entities.User;
import demo.model.service.UserService;


//Idicates that this class is a Rest controller
@RestController
//EndPoint = is a specific URL that represents a resource or functionality of a system.
@RequestMapping(value = "/users") 
public class UserResource {
	
	@Autowired
	UserService service;

	//ResponseEntity = Represents HTTP response
	//Maps HTTP GET requests to specific methods in a controller
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//@PathVariable show spring the restriction clause
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
