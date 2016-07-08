package com.eshop.shopingCart;

public class Lemon extends Item {
	
	private String description;

	public Lemon() {
		super();
		this.description ="";
	}

	public Lemon(String id, String name, int quntity, double price) {
		super(id, name, quntity, price);
	}

	public Lemon(String id, String name, int quntity, double price,String description) {
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
