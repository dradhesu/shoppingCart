package com.eshop.shopingCart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EBasket implements Basket {

	private List<Item> listOfItems = new ArrayList<Item>();

	@Override
	public boolean addItem(Item item) {
		return listOfItems.add(item);
	}

	@Override
	public boolean removeItem(Item item) {
		return listOfItems.remove(item);
	}

	@Override
	public double totalCost() {
		double price = 0.0d;
		Iterator listIterator = listOfItems.iterator();
		while (listIterator.hasNext()) {
			Item item = (Item) listIterator.next();
			price += (item.getPrice() * item.getQuantity()) ;
		}
		return price;
	}
	
	@Override
	public int itemCount(){
		return listOfItems.size();
	}

}
