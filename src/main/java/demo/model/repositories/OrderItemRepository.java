package demo.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.entities.OrderItem;
import demo.model.entities.PK.OrderItemPK;

//Have default methods 
public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK>{
}
