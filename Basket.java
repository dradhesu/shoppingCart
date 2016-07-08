package com.eshop.shopingCart;

public interface Basket {

	boolean addItem(Item item);

	boolean removeItem(Item item);

	double totalCost();

	int itemCount();
	
	 

}
