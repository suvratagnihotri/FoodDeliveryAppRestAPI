package com.food.delivery;


//Restaurent class.
public class Restaurent {
	private int id;
	private String name;
	private String location;
	public Restaurent() {}
	public Restaurent(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		
		return this.id;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String location() {
		return this.location;
	}
}
