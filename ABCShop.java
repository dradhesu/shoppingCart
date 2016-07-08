package com.eshop.shopingCart;

public class ABCShop implements Shop {

	@Override
	public double order(Basket basket) {
		 return basket.totalCost();
	}
}
