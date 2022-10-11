package com.learn.java.ch9.abstracts;

import com.learn.java.ch9.interfaces.Interface1;

public abstract class StudentAbstract implements Interface1{
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
	 * abstract methods must be overridden from subclass to be used. BUT, private prevents that
	 * i.e, illegal combination of modifiers − abstract and private
	 */
	//private static abstract void display();
	
	public void saySee() {
		System.out.println("see abstract class");
	}
}