package com.learn.java.day9.classtypes;

abstract class Student{
	String name = "Swati",className = "12-A";
	long id = 15154; 
	//abstract method
	abstract void printDetails();
}

//Concrete class
class StudentDetails extends Student{
	//implementation of abstract methods are given here
	void printDetails(){
		System.out.println("Name\t: "+name+"\nID\t: "+id+"\tClass\t: "+className);
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		//Student swati = new Student();		==> Cannot instantiate the type Student
		Student swati = new StudentDetails();
		swati.printDetails();
	}

}
