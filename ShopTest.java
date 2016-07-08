package com.shopingCart.test;

import org.junit.Assert;
import org.junit.Test;

import com.eshop.shopingCart.ABCShop;
import com.eshop.shopingCart.Apple;
import com.eshop.shopingCart.Banana;
import com.eshop.shopingCart.Basket;
import com.eshop.shopingCart.EBasket;
import com.eshop.shopingCart.Item;
import com.eshop.shopingCart.Lemon;
import com.eshop.shopingCart.Orange;
import com.eshop.shopingCart.Peache;
import com.eshop.shopingCart.Shop;

public class ShopTest {
	
	@Test
	public void testOrder(){
		Shop eShop = new ABCShop();
		Basket eBasket = new EBasket();
		
		Item apple = new Apple("101", "Red Apple", 6, 24.0d, "Kashmiri Red Apple");
		Item banana = new Banana("102", "Banana", 12, 5.0d, "Banana");
		Item orange = new Orange("103", "Orange", 2, 26.0d, " Nagpur Orange");
		Item peach = new Peache("104", "Peache", 1, 40.0d, " Peache");
		Item lemon = new Lemon("105", "Lemon", 4, 4.0d, " Yellow Lemon");
		
		eBasket.addItem(apple);
		eBasket.addItem(banana);
		eBasket.addItem(orange);
		eBasket.addItem(peach);
		eBasket.addItem(lemon); 
		
		double totalCost = eShop.order(eBasket);
		Assert.assertEquals(totalCost, eBasket.totalCost(),0.0);
	}

}
