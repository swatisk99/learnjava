package com.learn.java.ch12;
import java.util.Scanner;

public class GroceryStore {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			byte continueShopping = 1;
			int itemQuantity;
			Grocery item;
			double totalAmount=0,itemAmount;
			System.out.println("GROCERY STORE");
			do{
				System.out.print("Choices :\t1.Soap\t2.Shampoo\t3.Conditioner\t4.BodyWash\nEnter choice : ");
				switch(scanner.nextByte()) {
					case 1:	item = Grocery.SOAP;
							if(Grocery.SOAP.quantity == 0) {
								System.out.println("No soaps left");
							}
							else{
								System.out.print("Quantity : ");
								itemQuantity = scanner.nextInt();
								if(itemQuantity > Grocery.SOAP.quantity) {
									System.out.println("Only "+Grocery.SOAP.quantity+" soaps left");
									itemQuantity = Grocery.SOAP.quantity;
									Grocery.SOAP.quantity = 0;
								}
								else {
									Grocery.SOAP.quantity -= itemQuantity;
								}
								itemAmount = itemQuantity * Grocery.SOAP.PRICE;
								totalAmount += itemAmount;
								System.out.println("Total amount for item : "+ itemAmount);
							}
							break;
					case 2:	item = Grocery.SHAMPOO;
							if(Grocery.SHAMPOO.quantity == 0) {
								System.out.println("No shampoos left");
							}
							else{
								System.out.print("Quantity : ");
								itemQuantity = scanner.nextInt();
								if(itemQuantity > Grocery.SHAMPOO.quantity) {
									System.out.println("Only "+Grocery.SHAMPOO.quantity+" shampoos left");
									itemQuantity = Grocery.SHAMPOO.quantity;
									Grocery.SHAMPOO.quantity = 0;
								}
								else {
									Grocery.SHAMPOO.quantity -= itemQuantity;
								}
								itemAmount = itemQuantity * Grocery.SHAMPOO.PRICE;
								totalAmount += itemAmount;
								System.out.println("Total amount for item : "+ itemAmount);
							}
							break;
					case 3:	item = Grocery.CONDITIONER;
							if(Grocery.CONDITIONER.quantity == 0) {
								System.out.println("No conditioners left");
							}
							else{
								System.out.print("Quantity : ");
								itemQuantity = scanner.nextInt();
								if(itemQuantity > Grocery.CONDITIONER.quantity) {
									System.out.println("Only "+Grocery.CONDITIONER.quantity+" conditioners left");
									itemQuantity = Grocery.CONDITIONER.quantity;
									Grocery.CONDITIONER.quantity = 0;
								}
								else {
									Grocery.CONDITIONER.quantity -= itemQuantity;
								}
								itemAmount = itemQuantity * Grocery.CONDITIONER.PRICE;
								totalAmount += itemAmount;
								System.out.println("Total amount for item : "+ itemAmount);
							}
							break;
					case 4:	item = Grocery.BODYWASH;
							if(Grocery.BODYWASH.quantity == 0) {
								System.out.println("No bodywash left");
							}
							else{
								System.out.print("Quantity : ");
								itemQuantity = scanner.nextInt();
								if(itemQuantity > Grocery.BODYWASH.quantity) {
									System.out.println("Only "+Grocery.BODYWASH.quantity+" bodywash left");
									itemQuantity = Grocery.BODYWASH.quantity;
									Grocery.BODYWASH.quantity = 0;
								}
								else {
									Grocery.BODYWASH.quantity -= itemQuantity;
								}
								itemAmount = itemQuantity * Grocery.BODYWASH.PRICE;
								totalAmount += itemAmount;
								System.out.println("Total amount for item : "+ itemAmount);
							}
							break;				
					default:	System.out.println("Invalid selection");
				}
				System.out.println("Enter 1 to continue shopping : ");
				continueShopping = scanner.nextByte();
			}while(continueShopping==1) ;
			System.out.println("Amount to be payed : Rs."+totalAmount+"\n\nThankYou for shopping with us!!\nItems left : ");				
			}
			for(Grocery item : Grocery.values()) {
				System.out.println(item.name()+" : "+item.quantity);
			}
	}
}


