package demo.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.entities.Category;

//Have default methods 
public interface CategoryRepository extends JpaRepository<Category,Long>{
}
