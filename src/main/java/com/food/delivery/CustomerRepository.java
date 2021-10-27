package com.food.delivery;

//Customer repository to retrieve and add cusotmers in to the database.
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
}
