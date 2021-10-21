package com.food.delivery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	public int id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	public Customer() {}
	
	public Customer(String name, String email, String phone , String password) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
	        return id;
	    }
	 
	 public void setId(Integer id2) {
			this.id = id2;
			
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
	
	public String getEmail() {
		return this.email;
	}
	
	public void setphone(String phone) {
		this.phone = phone;
	}
	
	public String getphone () {
		return this.phone;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("Customer name :"+ this.getName() + " Email is :" + this.getEmail());
		return str.toString();
	}
}
