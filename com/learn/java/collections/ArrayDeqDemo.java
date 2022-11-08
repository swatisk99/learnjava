//$Id$
package com.learn.java.collections;

import java.util.*;
class PersDets{
	String name;
	char gender;
	PersDets(String name,char gender){
		this.name = name;
		this.gender = gender;
	}
	public static void displayDetails(PersDets obj) {
		System.out.println(obj.name+" "+obj.gender);
	}
	public String toString() {
			return (name+" "+gender);
	}
}
/**
 * implement arraydeq
 * used for stackor queue implementations.
 * faster implementation than ll
 * @author swati-15154
 *
 */
public class ArrayDeqDemo {
	public static Scanner scan = new Scanner(System.in);
	public static ArrayDeque <PersDets> customers = new ArrayDeque<>(0);
	public static void addCustomerName() {
			System.out.println("Enter name : ");
			String name = scan.nextLine();
			System.out.println("Enter gender(m/f/o) : ");
			char gender = scan.next().charAt(0);
			//In theory, addFirst and ddLast may throw exception if capacity is reached.. 
			//BUT, ArrayDeque has no capacity restrictions, so basically .addFirst() will never throw an exception
			customers.addLast(new PersDets(name,gender));		//customers.offerFirst(); and offerLast return boolean
			viewNextCustomer();		
	}
	public static void callCustomer() {
		PersDets customerDets = customers.poll();			//removeFirst() throws nosuchelementException when queue empty
		if(customerDets==null) {
			System.out.println("Queue empty ");
		}
		else {
			System.out.println("Calling "+customerDets.name);
			
			displayWaitingList();
		}
	}
	public static void displayWaitingList() {
		System.out.println("WaitingList\n");
		customers.forEach((x)->System.out.print(x+"  ->  "));
	}
	public static void viewNextCustomer() {
		System.out.println("Next customer is : "+customers.peek().name);		//getFirst() throws NoSuchElementException
	}
	public static void main(String[] args) {
//		System.out.println(customers.getFirst());
		int continueCheck,option;
		Random randomAction = new Random();
		do {
			option = randomAction.nextInt(2);
			switch(option) {
			case 0:			addCustomerName();
							break;
			case 1:			callCustomer();	
							break;
			}	
			System.out.println("Continue? Enter 1 ");
			continueCheck=scan.nextInt();
			scan.nextLine();
		}while(continueCheck==1);		
	}
}
