package com.learn.java.day9;

public class StaticMethods {
	static int variable = 5;
	int variable2 = 10;
	final int FINAL_VAR= 5;
	static void display() {
		System.out.println("\nIn static method display..\nStatic variable = "+variable);
		/**
		 * System.out.println("Non Static variable = "+variable2); ==> Cannot make a static reference to the non-static field variable2 
		 */
	}
	static {
		System.out.println("This is a static initialization block");
	}
	
	static int b=4;
	static {
		System.out.println("swati");
	}
	static String c="SK";
	void print() {
		
			System.out.println("hi");

		System.out.println("\nIn non-static method print...\nStatic variable ="+variable+"\nNon-static variable = "+variable2);
	}
	public static void main(String[] args) {
		//print();  Cannot make a static reference to the non-static method print() from the type StaticMethods
		StaticMethods staticMethods = new StaticMethods();
		staticMethods.print();
		display();		
		//System.out.println(staticMethods.FINAL_VAR++); ==> Unresolved compilation problem : The final field StaticMethods.finalVar cannot be assigned
	}
 
}
