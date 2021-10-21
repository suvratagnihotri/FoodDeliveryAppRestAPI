package com.food.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public List<Customer> list() {
        return service.listAllCustomer();
    }
	
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody Customer customer) {
        service.saveCustomer(customer);
        return new ResponseEntity<>("Customer is added SuccessFully",HttpStatus.OK);
    }
}