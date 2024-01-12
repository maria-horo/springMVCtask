package com.springmvc.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class OrderingFood {
	//ordering
	
	private int id;
	
	@NotEmpty(message = "This field is required")
	private String foodName;
	
	private String address;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public OrderingFood() {
		super();
	}
	
}
