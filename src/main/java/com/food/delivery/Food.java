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
@Table(name = "food")
public class Food {
	private int id;
	private String name;
	private int price;
	private String url;
	public Food(int id, String name, int price, String url) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.url = url;
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
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return this.url;
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("Food name : "+this.getName() + " Food price : "+this.getPrice() + "Item Image :"+this.getUrl() );
		return null;
	}
}

