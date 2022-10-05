/**
 * THUVASHIKA
 */
package com.learn.java.day9.extra;

class SuperClass{
	int c= 23;
	{
		//System.out.println("non static super");
	}
	static int a=10;
	static {
		a=50;
		//System.out.println("super class");
	}
	void get(DemoClass obj) {
		System.out.println(this);
		display();              
		obj.display(); 
	}
	void get() {
		System.out.println(this);
		display();              
	}
	void display() {
		System.out.println("Parent class");
	}
}
class SubClass extends SuperClass {
	{
		//System.out.println("non static super");
	}
	int b=20;
	static {
		//System.out.println("sub");
		a=30;
	}
	static int s=100;
	void display() {
		System.out.println("Child class");
	}
}
public class DemoClass extends SubClass{
	void display() {
		System.out.println("Demo class");
	}
	public static void main(String[] args) {
		//System.out.println(SubClass.a);
		DemoClass obj=new DemoClass();
		SuperClass obj2=new SuperClass();
		SubClass obj3=new SubClass();
		//obj3.get(obj2);  //The object is Super class...so "this" is Superclass object
		//obj.get(obj2);  //The object is Sub class...so "this" is Subclass object
		//System.out.println(obj.a);
		obj3.get();
	}
}