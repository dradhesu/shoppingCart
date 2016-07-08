package com.eshop.shopingCart;

public class Banana extends Item {
	
	private String description;

	public Banana() {
		super();
		this.description ="";
	}

	public Banana(String id, String name, int quntity, double price) {
		super(id, name, quntity, price);
	}

	public Banana(String id, String name, int quntity, double price,String description) {
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
