package com.learn.java.ch12;

public enum Grocery {
	SOAP(65.00 , 30) , SHAMPOO(150.50, 20) , CONDITIONER(200.00, 15) , BODYWASH(180.00, 10) ;
	int quantity;
	final double PRICE;
	Grocery(double PRICE,int quantity) {
		this.PRICE = PRICE;
		this.quantity = quantity;
	}
	public double getItemPriceINT (int itemQuantity) {
		if(itemQuantity > quantity) {
			System.out.println("Only "+ quantity+" soaps available");
			itemQuantity = quantity;
			quantity = 0;
		}
		else {
			quantity -= itemQuantity;
		}
		double itemAmount = itemQuantity * PRICE;
		System.out.println("Total amount for item : "+ itemAmount);
		return itemAmount;	
		
	}
}
