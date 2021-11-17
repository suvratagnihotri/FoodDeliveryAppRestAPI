package com.food.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller class for the food entity.

@RestController
@RequestMapping("/food")
public class FoodController {
	@Autowired
	FoodService service;
	
	@GetMapping("/all")
	public List<Food> list(){
		return service.listAllFoods();
	}
	
	@PostMapping("/add")
	public void addItem(Food food) {
		service.addItem(food);
	}
}
