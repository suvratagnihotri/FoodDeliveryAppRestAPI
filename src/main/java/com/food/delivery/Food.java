package com.food.delivery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Food class which will be related to each to Restaurent. 
//It contains name, price, imageUrl of the food items.
//The table for food items has to be created dynamically.
@Entity
@Table(name = "restaurent_menu")
public class Food {
	private int id;
	private int restaurentId;
	private String name;
	private int price;
	public Food() {}
	public Food(int id,int restaurentId, String name, int price) {
		this.id = id;
		this.restaurentId = restaurentId;
		this.name = name;
		this.price = price;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setRestaurentId(int restaurentId) {
		this.restaurentId = restaurentId;
	}
	public int getRestaurentId() {
		return this.restaurentId;
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("Food name : "+this.getName() + " Food price : "+this.getPrice() + "Restaurent Id :"+this.getRestaurentId() );
		return null;
	}
}

