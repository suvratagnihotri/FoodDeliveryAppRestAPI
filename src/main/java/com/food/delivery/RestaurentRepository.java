package com.food.delivery;


//Restaurents repository to perform CRUD operations in to the databse.
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurentRepository extends JpaRepository<Restaurent, Integer>{

}
