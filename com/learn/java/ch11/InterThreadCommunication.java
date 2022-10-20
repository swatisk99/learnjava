package com.learn.java.ch11;

import java.util.*;

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
class TicketSeller implements Runnable{
	Ticket ticket;
	TicketSeller(Ticket tkt){
		ticket = tkt;
		new Thread(this).start();
	}
	public void run() {
		while(true) {
			ticket.returnTicket();
		}
	}
}
class Buyer implements Runnable{
	Ticket ticket;
	Buyer(Ticket tkt){
		ticket = tkt;
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		while(true) {
			ticket.buyTicket();
		}
	}
	
}
public class InterThreadCommunication {
	public static void main(String[] args) {
		Ticket tickets = new Ticket();
		new TicketSeller(tickets);
		new Buyer(tickets);
	}
}
