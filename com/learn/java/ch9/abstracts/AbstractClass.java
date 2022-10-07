package com.learn.java.ch9.abstracts;

import java.util.Scanner;

abstract class StudentDetails extends StudentAbstract{
	int d =4;
	long id = 1514; 
	
	//implementation of abstract methods are given here
	public void printDetails(){
		Scanner scan = new Scanner(System.in);
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
	
	public void sayHello() {
		System.out.println("HELLO!!!");
	}
	
}

class Concrete extends StudentDetails{

	@Override
	public void getAge() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age : ");
		age = scan.nextByte();
		System.out.println("Age "+age+" "+d);		
	}
	
	
}


public class AbstractClass {

	public static void main(String[] args){
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
		
		//System.out.println(swati.d);
		
	}

}
