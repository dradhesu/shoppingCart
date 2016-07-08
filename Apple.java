package com.eshop.shopingCart;

public class Apple extends Item {
	
	private String description;
	
	public Apple() {
		super();
		this.description ="";
	}

	public Apple(String id, String name, int quntity, double price) {
		super(id, name, quntity, price);
	}

	public Apple(String id, String name, int quntity, double price,String description) {
		super(id, name, quntity, price);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	 
}
