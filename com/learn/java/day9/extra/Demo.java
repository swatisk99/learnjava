package com.learn.java.day9.extra;
import static com.learn.java.day9.OuterClass.*;
class A{
	static int value=4;
	static {
		System.out.println("I'm static block in A");
	}
	void callsAnotherMethod() {
		System.out.println("This is first method of A\nCalling next method...");
		
		this.displayMessage();
		System.out.println(this);
		//super.hashCode();
	}
	
	void callsAnotherMethod(B obj) {
		System.out.println("This is first method of A\nCalling next method...");
		obj.displayMessage();
		this.displayMessage();
		System.out.println(this);
		//super.hashCode();
	}
	
	void callsAnotherMethod(D obj) {
		System.out.println("This is first method of A\nCalling next method...");
		obj.displayMessage();
		this.displayMessage();
		System.out.println(this);
		//super.hashCode();
	}
	
	void displayMessage(byte ...bs) {
		System.out.println("This is the second method in class A. This method was called by the first method");
	}
	 void printMessage() {
		System.out.println("This is not a final method in A");
	}
	 void overloadMethod(char character) {
		 System.out.println("character");
	 }
}

class B extends A{
	
	static {
		value=5;
		System.out.println("i'm static block in B");
	}
	static int c=4;
	static {
		c=5;
		System.out.println("i'm static block in B");
		random();
	}
	{	
		System.out.println("hi");
	}
	B(){
		System.out.println("hello");
	}
	//protected int value;
	void callsAnotherMethod() {
		System.out.println("This is first method of B--->Calling next method...");
		displayMessage();
		this.displayMessage();
		//super.displayMessage();
		super.callsAnotherMethod(this);
		
	}
	
	protected void displayMessage() {
		System.out.println("This is the second method in class B. This method was called by the first method");
		//displayMessage(); == //this.displayMessage();
		//super.displayMessage();
	}
	 
	 void overloadMethod(int character) {
		 System.out.println("Integer");
	 }
	 
	 void overloadMethod(long character) {
		 System.out.println("Long");
	 }
	final void printMessage() {
		System.out.println("This is a final method in B");
	}
	static void random() {
		System.out.println("Random static method in B");
	}
}


class Demo {

	public static void main(String[] args) {
		//System.out.println(D.value);
		A objA = new A();
		//objA.callsAnotherMethod();
		//System.out.println();		
		
		B objB = new B();
		//objB.callsAnotherMethod();
		//System.out.println();
		
		D objD = new D();
		//objD.callsAnotherMethod();
		//System.out.println();
		
		//objA.printMessage();
		//objB.printMessage();
		//objD.printMessage();
		//long variable = 10l;
		//objB.overloadMethod((int)variable);
		 
		 A objB1 = new B();
		 //objB1.callsAnotherMethod();
		// System.out.print(d);
		 
		 
		 StaticClass.testing();
	}

}
