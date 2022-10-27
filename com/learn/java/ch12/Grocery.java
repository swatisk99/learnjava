package com.learn.java.ch12;

public enum Grocery {
	SOAP(65.00 , 30) , SHAMPOO(150.50, 20) , CONDITIONER(200.00, 15) , BODYWASH(180.00, 10) ;
	int quantity;
	final double PRICE;
	Grocery(double PRICE,int quantity) {
		this.PRICE = PRICE;
		this.quantity = quantity;
	}
}
