package com.learn.java.ch9.abstracts;

public abstract class StudentAbstract{
	public String name = "Swati";
	public String className = "12-A";
	public long id = 15154; 
	public byte age=17;
	public void sayHello() {
		System.out.println("HELLO!");
	}
	//abstract method
	public abstract void printDetails();
	public abstract void getAge();
	
	/**
	 * abstract methods must be overriden from subclass to be used. BUT, private prevents that
	 * i.e, illegal combination of modifiers − abstract and private
	 */
	//private static abstract void display();
	
}