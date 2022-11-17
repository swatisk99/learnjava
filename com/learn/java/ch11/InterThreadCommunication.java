package com.learn.java.ch11;

import java.util.*;
/**
 * contains 2 methods buy and sell based on number of tickets
 * @author swati-15154
 *
 */
class Ticket{
	Random random = new Random();
	static int numberOfTickets=20;
	boolean isSalePossible = true;
	synchronized void buyTicket() {
		while(!isSalePossible) {
			try{
				wait();
			}
			catch(Exception e) {
				System.out.println("InterruptedException caught");
			}
		}
		System.out.println("Bought 1 ticket \tNOW available ---> "+(--numberOfTickets));
		if(numberOfTickets>=20 || numberOfTickets<=0) {
			isSalePossible = false;
		}
		else {
			isSalePossible = random.nextBoolean();
		}
		//notify all waiting threads that method can be used by any 1 at a time
		notifyAll();
	}		
	synchronized void returnTicket() {
		while(isSalePossible) {
			try{
				wait();
			}
			catch(Exception e) {
				System.out.println("InterruptedException caught");
			}
		}
		System.out.println("1 ticket returned \t"+(++numberOfTickets)+" tickets NOW available");
		if(numberOfTickets>=0 && numberOfTickets<=20) {
			isSalePossible = true;
		}
		else {
			isSalePossible = random.nextBoolean();
		}		
		notifyAll();
	}
}
/**
 * Creates thread for selling tickets(object of Ticket class)
 * @author swati-15154
 *
 */
class TicketSeller implements Runnable{
	Ticket ticket;
	TicketSeller(Ticket tkt){
		ticket = tkt;
	}
	public void run() {
		while(true) {
			ticket.returnTicket();
		}
	}
}
/**
 * Creates thread for buying tickets(object of Ticket class)
 * @author swati-15154
 *
 */
class Buyer implements Runnable{
	Ticket ticket;
	Buyer(Ticket tkt){
		ticket = tkt;
	}
	@Override
	public void run() {
		while(true) {
			ticket.buyTicket();
		}
	}
}
/**
 * Program to see Producer-Consumer like behavior.
 * @author swati-15154
 *
 */
public class InterThreadCommunication {
	public static void main(String[] args) {
		Ticket tickets = new Ticket();
		new Thread(new TicketSeller(tickets)).start();
		new Thread(new Buyer(tickets)).start();
	}
}
