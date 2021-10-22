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
		List <Customer> customers= repository.findAll();
		for(int i =1; i<customers.size(); i++) {
			if(customers.get(i).getName().equals(name)) {
				if(customers.get(i).getEmail().equals(email)) {
					return customers.get(i);
				}
			}
		}
		return null;
	}
	
	public void saveCustomer(Customer customer) {
		repository.save(customer);
	}

	public boolean deleteCustomer(CustomerModel customer) {
		List <Customer> customers = repository.findAll();
		for(int i=0; i<customers.size(); i++) {
			if(customers.get(i).getName().equals(customer.name)) {
				if(customers.get(i).getEmail().equals(customer.email)) {
					repository.deleteById(customers.get(i).getId());
					return true;
				}
			}
		}
		return false;
	}
}
