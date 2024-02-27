package demo.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.entities.Order;

//Have default methods 
public interface OrderRepository extends JpaRepository<Order,Long>{
}
