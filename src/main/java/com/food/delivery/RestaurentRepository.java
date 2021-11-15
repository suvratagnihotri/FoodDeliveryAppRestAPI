package com.food.delivery;


//Restaurents repository to perform CRUD operations in to the databse.
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RestaurentRepository extends JpaRepository<Restaurent, Integer>{
	
	
	@Modifying
	@Query(value = "INSERT INTO restaurent_menus_table (name) VALUES (:menuTableName);",nativeQuery=true)
	public void createRestaurentMenuTable(@Param("menuTableName") String menuTableName);

}
