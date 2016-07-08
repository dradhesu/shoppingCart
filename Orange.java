package com.eshop.shopingCart;

public class Orange extends Item {
	
	private String description;

	public Orange() {
		super();
		this.description ="";
	}

	public Orange(String id, String name, int quntity, double price) {
		super(id, name, quntity, price);
	}

	public Orange(String id, String name, int quntity, double price,String description) {
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
