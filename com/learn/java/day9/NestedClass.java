package com.learn.java.day9;

class Outer{
	int value_out = 10;
	void printValue() {
		System.out.println("This is Nest class..\nvalue of variable in Nest Class = "+value_out);
	}
	void callNested() {
		System.out.println("Calling Nested Class...\n...");
		Inner nestedClass = new Inner();
		nestedClass.print();
	}
	
	/**
	 * non static nested class
	 * @author swati-15154
	 *
	 */
	class Inner{
		int value_in = 14;
		void print() {
			System.out.println("\nThis is an Inner class..\nvalue of variable in Nest Class = "+value_out+"\nvalue of variable in nested class = "+value_in);	
		}
	}
	
	/**
	 * creating class within method
	 */
	void createNestedClass() {
		System.out.println("\nThis is a Nest class method...\nWill be creating another nested class...");
		class Nested{
			int value = 17;
			void printValue() {
				System.out.println("Nested class created...Value of variable = "+value);
			}
		}
		Nested newNest = new Nested();
		newNest.printValue();
	}
	//value_in cannot be resolved to a variable
	/**void print() {
		System.out.println("This is Nest class..\nvalue of variable in Inner Class = "+value_in);
	}
	**/
}

public class NestedClass {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.printValue();
		out.callNested();
		System.out.println("\nCalling inner class from main..");
		
		Outer.Inner nested=out.new Inner(); 
		nested.print();
		
		out.createNestedClass();
	}
}
