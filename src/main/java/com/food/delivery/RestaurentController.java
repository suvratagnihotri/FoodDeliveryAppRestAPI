package com.food.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurent")
public class RestaurentController {
	@Autowired
	RestaurentService service;
	
	@GetMapping("/all")
	public List<Restaurent> list(){
		return service.listAllRestaurent();
	}
}
