package com.food.delivery;

import java.util.List;

//Food repository class, to perform CRUD operations in to the databse.
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FoodRepository extends JpaRepository<Food,Integer>{
	
	@Query(value = "SELECT * FROM restaurent_menu WHERE restaurent_id=?1",nativeQuery=true)
	public List<Food> getMenu(Integer restaurentId);
}
