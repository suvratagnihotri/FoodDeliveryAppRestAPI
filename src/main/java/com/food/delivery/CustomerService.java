package com.food.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerRepository repository;
	
	
	public List<Customer> listAllCustomer(){
		return repository.findAll();
	}
	
	public Customer findById(Integer id) {
		return repository.findById(id).get();
	}
	
	public Customer findByName(String name,String email) {
		return repository.findById(1).get();
	}
	
	public void saveCustomer(Customer customer) {
		repository.save(customer);
	}
}
