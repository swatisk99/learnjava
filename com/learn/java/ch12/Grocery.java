package com.learn.java.ch12;

public enum Grocery {
	SOAP(65.00 , 30) , SHAMPOO(150.50, 20) , CONDITIONER(200.00, 15) , BODYWASH(180.00, 10) , PERFUME(100.00);
	//changes with each user entry
	private int quantity;
	final double PRICE;
	Grocery(double PRICE){
		this.PRICE = PRICE;
	}
	Grocery(double PRICE,int quantity) {
		this.PRICE = PRICE;
		this.quantity = quantity;
	}
	public void increaseItemCount(int quantity) {
		this.quantity += quantity;
	}
	public int getItemCount() {
		return this.quantity;
	}
	public boolean checkItemAvailabilty() {
		if(quantity == 0) {
			System.out.println("No "+this+" left");
			return false;
		}
		return true;
	}
	/**
	 * if item's available calculates the amount for the given number of items. 
	 * If item user needs are less than available quantity, entire available stock is given
	 * @param itemQuantity
	 * @return itemAmount
	 */
	public double getItemPriceINT (int itemQuantity) {
		if(itemQuantity > quantity) {
			System.out.println("Only "+ quantity+" "+this+" available");
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
