package com.food.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RestaurentService {
	@Autowired
	private RestaurentRepository repository;
	
	public List<Restaurent> listAllRestaurent(){
		return repository.findAll();
	}
	
	public void save(Restaurent restaurent) {
		repository.save(restaurent);
	}
}
