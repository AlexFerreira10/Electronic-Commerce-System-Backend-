package demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.entities.Category;
import demo.model.service.CategoryService;

//Idicates that this class is a Rest controller
@RestController
//EndPoint = is a specific URL that represents a resource or functionality of a system.
@RequestMapping(value = "/categories") 
public class CategoryResource {
	
	@Autowired
	CategoryService service;

	//ResponseEntity = Represents HTTP response
	//Maps HTTP GET requests to specific methods in a controller
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//@PathVariable show spring the restriction clause
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}