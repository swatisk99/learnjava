package com.learn.java.day9;

import java.util.Scanner;

public class Building {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double length=scan.nextDouble();
		System.out.println("Enter floor width : ");
		double width=scan.nextDouble();
		System.out.println("Enter floor height : ");
		double height =scan.nextDouble();
		
		Room room1=new Room(length,width,height);
		
		System.out.println("Enter floor : ");
		room1.floor=scan.nextByte();
		System.out.println("Enter room name : ");
		scan.next();
		room1.roomName=scan.nextLine();
		System.out.println("Enter number of people in room : ");
		room1.population=scan.nextLong();
		System.out.println("Enter number of desks in room : ");
		room1.desks=scan.nextLong();
		System.out.println("Enter number of chairs in room : ");
		room1.chairs=scan.nextLong();
		System.out.println("Enter number of boards in room : ");
		room1.boards=scan.nextLong();
		System.out.println("Enter room temperature : ");
		room1.temperature=scan.nextFloat();
		System.out.println("Enter floor length: ");
		System.out.println("Area of room : "+room1.findArea());
		
	}

}
class Room{
	double width,height,length;
	long desks,chairs,systems,boards,population;
	float temperature;
	byte floor;
	String roomName;
	Room(double length, double width, double height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	double findArea () {
		return length*width*height;
	}
	
	
}