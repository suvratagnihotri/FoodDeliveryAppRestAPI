package com.food.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	@GetMapping("/find")
	public Customer find(@RequestBody CustomerModel model) {
		Customer customer = service.findByName(model.name, model.email);
		return customer;
	}
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody Customer customer) {
        service.saveCustomer(customer);
        return new ResponseEntity<>("Customer is added SuccessFully",HttpStatus.OK);
    }
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> delete(@RequestBody CustomerModel customer) {
		boolean deleted = service.deleteCustomer(customer);
		if(deleted) {
			return new ResponseEntity<>("Customer is deleted SuccessFully",HttpStatus.OK);
		}
		return new ResponseEntity<>("Customer not found",HttpStatus.OK);
	}
	
	
}
