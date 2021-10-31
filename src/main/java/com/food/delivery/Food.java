package com.food.delivery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Food class which will be related to each to Restaurent. 
//It contains name, price, imageUrl of the food items.
@Entity
@Table(name = "food")
public class Food {
	private int id;
	private String name;
	private int price;
	private String imageUrl;
	public Food(int id, String name, int price, String imageUrl) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.imageUrl = imageUrl;
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
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageUrl() {
		return this.imageUrl;
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("Food name : "+this.getName() + " Food price : "+this.getPrice() );
		return null;
	}
}

