package com.food.delivery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//Main logic to fetch and save data in to the database.
@Service
@Transactional
public class RestaurentService {
	@Autowired
	private RestaurentRepository repository;
	   EntityManager entityManager;
//	   @Autowired
//	  Query createQuery(String tableName) {
//	       return entityManager.createNativeQuery("CREATE TABLE "+tableName+ " (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,name varchar(255),price int,url varchar(255))");
//	   }
	
	public List<Restaurent> listAllRestaurent(){
		return repository.findAll();
	}
	
	public void saveRestaurent(Restaurent restaurent) {
		repository.save(restaurent);
		String tableName = (restaurent.getName()+restaurent.getId()).replaceAll("\\s+","").toLowerCase().toString(); 
		repository.insertRestaurentMenuTable(tableName);
//		Query query = createQuery(tableName);
		repository.createRestaurentMenuTable("newDelhi40%");
		System.out.print(restaurent.getName());
	}
	
	public boolean checkForTable(String tableName) {
		if(repository.checkForTable(tableName)!=null) {
			return true;
		}
		return false;
	}
	
	public void addItem(String tableName, Food food) {
		repository.addItem(tableName, food.getName(), food.getPrice(),food.getUrl());
	}
	public boolean deleteRestaurent(Restaurent restaurent) {
		List <Restaurent> restaurents = repository.findAll();
		for(int i=0; i<restaurents.size(); i++) {
			if(restaurents.get(i).getName().equals(restaurent.getName())) {
				if(restaurents.get(i).getLocation().equals(restaurent.getLocation())) {
					repository.deleteById(restaurents.get(i).getId());
					return true;
				}
			}
		}
		return false;
	}
}
