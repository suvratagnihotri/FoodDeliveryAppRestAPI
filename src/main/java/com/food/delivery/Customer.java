package com.food.delivery;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	private String name;
	private String email;
	private int phoneNumber;
	private String password;
	
	public Customer() {}
	
	public Customer(String name, String email, int phoneNumber , String password) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMail() {
		return this.email;
	}
	
	public void setNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getNumber () {
		return this.phoneNumber;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword(String password) {
		return this.password;
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("Customer name :"+ this.getName() + " Email is :" + this.getMail());
		return str.toString();
	}
}
