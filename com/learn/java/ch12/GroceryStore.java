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
								itemAmount = Grocery.SOAP.getItemPriceINT(itemQuantity);
								totalAmount += itemAmount;
							}
							break;
					case 2:	item = Grocery.SHAMPOO;
							if(Grocery.SHAMPOO.quantity == 0) {
								System.out.println("No shampoos left");
							}
							else{
								System.out.print("Quantity : ");
								itemQuantity = scanner.nextInt();
								itemAmount = Grocery.SHAMPOO.getItemPriceINT(itemQuantity);
								totalAmount += itemAmount;
							}
							break;
					case 3:	item = Grocery.CONDITIONER;
							if(Grocery.CONDITIONER.quantity == 0) {
								System.out.println("No conditioners left");
							}
							else{
								System.out.print("Quantity : ");
								itemQuantity = scanner.nextInt();
								itemAmount = Grocery.CONDITIONER.getItemPriceINT(itemQuantity);
								totalAmount += itemAmount;
							}
							break;
					case 4:	item = Grocery.BODYWASH;
							if(Grocery.BODYWASH.quantity == 0) {
								System.out.println("No bodywash left");
							}
							else{
								System.out.print("Quantity : ");
								itemQuantity = scanner.nextInt();
								itemAmount = Grocery.BODYWASH.getItemPriceINT(itemQuantity);
								totalAmount += itemAmount;
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


