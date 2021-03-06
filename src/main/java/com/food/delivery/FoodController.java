package com.food.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller class for the food entity.

@RestController
@RequestMapping("/food")
public class FoodController {
	@Autowired
	FoodService service;
	
	@GetMapping("/all/{restaurentId}")
	public List<Food> list(@PathVariable("restaurentId") Integer restaurentId){
		return service.listAllFoods(restaurentId);
	}
	
	@PostMapping("/add")
	public void addItem(@RequestBody Food food) {
		service.addItem(food);
	}
	
	
}
