package com.learn.java.day9.classtypes;

import java.util.Scanner;

//Concrete class
abstract class StudentDetails extends StudentAbstract{
	int d =4;
	long id = 1514; 
	static Scanner scan = new Scanner(System.in);
	//implementation of abstract methods are given here
	protected void printDetails(){
		System.out.println("Name\t: "+name+"\nID\t: "+id+"\tClass\t: "+className);
		getAge();
	}
	
	/**
	//If this method is removed, then the class must be made abstract
	protected void getAge() {
		System.out.println("Enter age : ");
		age = scan.nextByte();
		System.out.println("Age "+age+" "+d);
		
	}
	*/
	void sayHello() {
		System.out.println("HELLO!!!");
	}
	
}

class Concrete extends StudentDetails{

	@Override
	protected void getAge() {
		System.out.println("Enter age : ");
		age = StudentDetails.scan.nextByte();
		System.out.println("Age "+age+" "+d);		
	}
	void closeScanner() {
		scan.close();
	}
	
}


public class AbstractClass {

	public static void main(String[] args) {
		//Student swati = new Student();		==> Cannot instantiate the type Student
		StudentAbstract obj1 = new Concrete();
		StudentDetails obj2 = new Concrete();
		Concrete obj3 = new Concrete();
		obj1.printDetails();
		obj1.sayHello();
		
		obj2.printDetails();
		obj2.sayHello();
		
		obj3.printDetails();
		obj3.sayHello();
		obj3.closeScanner();
		
		//System.out.println(swati.d);
		
	}

}
