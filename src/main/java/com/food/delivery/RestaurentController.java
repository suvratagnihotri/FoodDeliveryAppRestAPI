package com.food.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;


//Controller class for the Restaurent , to fetch restaurents from the databse using API.
@RestController
@RequestMapping("/restaurent")
public class RestaurentController {
	@Autowired
	RestaurentService service;
	
	@GetMapping("/all")
	public List<Restaurent> list(){
		return service.listAllRestaurent();
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody Restaurent restaurent) {
        service.saveRestaurent(restaurent);
        return new ResponseEntity<>("Restaurent is added SuccessFully",HttpStatus.OK);
    }
	
	@PostMapping("/add/food")
	public ResponseEntity<String> addMenuItem(@RequestBody Food food){
		try {
			service.addItem(food);
			return new ResponseEntity<>("Menu Item is added SuccessFully",HttpStatus.OK);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage().toString());
			return new ResponseEntity<>("Menu Item can not be added",HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> delete(@RequestBody Restaurent restaurent) {
		boolean deleted = service.deleteRestaurent(restaurent);
		if(deleted) {
			return new ResponseEntity<>("Restaurent is deleted SuccessFully",HttpStatus.OK);
		}
		return new ResponseEntity<>("CRestaurent not found",HttpStatus.OK);
	}
}
