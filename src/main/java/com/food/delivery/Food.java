package com.food.delivery;


//Food class which will be related to each to Restaurent. It contains name, price, imageUrl of the food items.
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
}
