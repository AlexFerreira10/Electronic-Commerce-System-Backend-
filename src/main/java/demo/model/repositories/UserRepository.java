package demo.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.entities.User;

//Have default methods 
public interface UserRepository extends JpaRepository<User,Long>{
}
