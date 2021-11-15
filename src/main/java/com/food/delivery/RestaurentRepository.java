package com.food.delivery;


//Restaurents repository to perform CRUD operations in to the databse.
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RestaurentRepository extends JpaRepository<Restaurent, Integer>{
	
	
	@Modifying
	@Query(value = "INSERT INTO restaurent_menus_table (name) VALUES (:menuTableName);",nativeQuery=true)
	public void insertRestaurentMenuTable(@Param("menuTableName") String menuTableName);
	
	@Modifying
	@Query(value = "CREATE TABLE CONCAT('%',:menuTableName,'%') (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,name varchar(255),price int,url varchar(255));",nativeQuery=true)
	public void createRestaurentMenuTable(@Param("menuTableName") String menuTableName);
	
	
	@Query(value = "SHOW TABLES LIKE ':menuTableName';",nativeQuery=true)
	public String checkForTable(@Param("menuTableName") String menuTableName);
	
	@Modifying
	@Query(value = "INSERT INTO CONCAT('%',:menuTableName,'%') (name,price,url) VALUES (:name, :price,:url)",nativeQuery=true)
	public void addItem(@Param("menuTableName") String menuTableName,String name, int price,String url);
//	
//	@Query(value = "",nativeQuery=true)

}
