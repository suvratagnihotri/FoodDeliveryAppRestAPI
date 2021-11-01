package com.food.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//Main logic to fetch and save data in to the database.
@Service
@Transactional
public class RestaurentService {
	@Autowired
	private RestaurentRepository repository;
	
	public List<Restaurent> listAllRestaurent(){
		return repository.findAll();
	}
	
	public void saveRestaurent(Restaurent restaurent) {
		repository.save(restaurent);
		System.out.print(restaurent.getName());
	}
	
	public boolean deleteRestaurent(Restaurent restaurent) {
		List <Restaurent> restaurents = repository.findAll();
		for(int i=0; i<restaurents.size(); i++) {
			if(restaurents.get(i).getName().equals(restaurent.getName())) {
				if(restaurents.get(i).getLocation().equals(restaurent.getLocation())) {
					repository.deleteById(restaurents.get(i).getId());
					return true;
				}
			}
		}
		return false;
	}
}
