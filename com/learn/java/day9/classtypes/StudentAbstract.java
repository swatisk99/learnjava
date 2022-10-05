package com.learn.java.day9.classtypes;

public abstract class StudentAbstract{
	String name = "Swati",className = "12-A";
	long id = 15154; 
	byte age=17;
	void sayHello() {
		System.out.println("HELLO!");
	}
	//abstract method
	protected abstract void printDetails();
	protected abstract void getAge();
	
}