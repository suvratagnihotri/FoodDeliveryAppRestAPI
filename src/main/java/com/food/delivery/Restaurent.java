package com.food.delivery;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "restaurent")
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
	
	public String getLocation() {
		return this.location;
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("Hotel Name :" +this.getName() + " Location :" +this.getLocation());
		return str.toString();
	}
}
