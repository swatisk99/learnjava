package com.learn.java.ch9.abstracts;

import java.util.Scanner;

import com.learn.java.ch9.interfaces.Interface1;

abstract class StudentDetails extends StudentAbstract implements Interface1{//Abstract class can give implementations of interface the vice versa not possible since interface only extend interface
	
	int d =4;
	long id = 1514; 
	
	//implementation of abstract methods are given here
	public void printDetails(){
		System.out.println("Name\t: "+name+"\nID\t: "+id+"\tClass\t: "+className);
		getAge();
	}
	
	
	//If the class was concrete, this method SHOULD be implemented
	/**
	protected void getAge() {
		System.out.println("Enter age : ");
		age = scan.nextByte();
		System.out.println("Age "+age+" "+d);
		
	}
	*/
	
	//public static abstract void say();		//cannot have static abstract methods since static methods can't be overridden
	
	public void sayHello() {
		System.out.println("HELLO!!!");
	}
	
}


class Concrete extends StudentDetails{
	
	@Override
	public void getAge(){
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Enter age : ");
			age = scan.nextByte();
			System.out.println("Age "+age+" "+d);
		
			
	}
	/**
	 * Implementing method of Interface1 which was implemented by Parent of this(Concrete) class, StudentDetails
	 */
	@Override
	public void method1(int param) {
		System.out.println("Method of Interface1 implemented by child class");
	}
	
	public static void say() { 
		System.out.println("Say method");
	}
	
}


public class AbstractClass{
	public static void main(String[] args){
		//Student swati = new Student();		==> Cannot instantiate the type Student
	
		StudentAbstract obj1 = new Concrete();
		StudentDetails obj2 = new Concrete();
		Concrete obj3 = new Concrete();
		obj1.printDetails();
		obj1.sayHello();
		
		obj2.printDetails();
		obj2.sayHello();
		obj2.method1(0);
		//StudentDetails.say();
		
		obj3.printDetails();
		obj3.sayHello();
		obj3.method1(0);
		//System.out.println(swati.d);
		
	}
}
