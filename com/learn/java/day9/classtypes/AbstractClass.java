package com.learn.java.day9.classtypes;

import java.util.Scanner;

//Concrete class
class StudentDetails extends StudentAbstract{
	int d =4;
	//implementation of abstract methods are given here
	void printDetails(){
		System.out.println("Name\t: "+name+"\nID\t: "+id+"\tClass\t: "+className);
		getAge();
	}
	
	
	protected void getAge() {
		System.out.println("Enter age : ");
		Scanner scan = new Scanner(System.in);
		age = scan.nextByte();
		System.out.println("Age "+age+" "+d);

		
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		//Student swati = new Student();		==> Cannot instantiate the type Student
		StudentAbstract swati = new StudentDetails();
		StudentDetails sk = new StudentDetails();
		swati.printDetails();
		sk.printDetails();
		
	}

}
