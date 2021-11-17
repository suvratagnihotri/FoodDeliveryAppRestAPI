package com.food.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Service for the food class, how data will be saved and retrived from the database.
@Service
@Transactional
public class FoodService {
	@Autowired
	private FoodRepository repository;

	public List<Food> listAllFoods(Integer restaurentId){
		return repository.getMenu(restaurentId);
	}
	
	public void addItem(Food food) {
		repository.save(food);
	} 
}
