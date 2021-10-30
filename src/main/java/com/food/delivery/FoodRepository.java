package com.food.delivery;

//Food repository class, to perform CRUD operations in to the databse.
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Integer>{

}
