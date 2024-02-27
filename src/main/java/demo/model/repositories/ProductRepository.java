package demo.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.entities.Product;

//Have default methods 
public interface ProductRepository extends JpaRepository<Product,Long>{
}
