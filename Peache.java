package com.eshop.shopingCart;

public class Peache extends Item {
	
	private String description;
	
	public Peache() {
		super();
		this.description ="";
	}

	public Peache(String id, String name, int quntity, double price) {
		super(id, name, quntity, price);
	}
	
	public Peache(String id, String name, int quntity, double price,String description) {
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
