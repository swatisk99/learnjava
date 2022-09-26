package com.learn.java.day9.extra;

public class D extends B{
	D(){
		{	System.out.println("hi");	}
	}
	{
		System.out.println("non static block outside constructor in class D");
	}
	static {
		System.out.println("im static block in D");
	}
	{
		System.out.println("im non-static block in D");
	}
	void callsAnotherMethod() {
		System.out.println("This is first method of D--->Calling next method...");
		displayMessage();
		//this.displayMessage();
		//super.displayMessage();
		super.callsAnotherMethod();


	}

	
	public void displayMessage() {
		System.out.println("This is the second method in class D. This method was called by the first method");
	}
	
	//void printMessage() {}		===>	Cannot override the final method from B
}