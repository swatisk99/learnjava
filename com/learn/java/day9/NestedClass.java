package com.learn.java.day9;

class Nest{
	int value_out = 10;
	void printValue() {
		System.out.println("This is Nest class..\nvalue of variable in Nest Class = "+value_out);
	}
	void callNested() {
		System.out.println("Calling Nested Class...\n...");
		Nested nestedClass = new Nested();
		nestedClass.print();
	}
	class Nested{
		int value_in = 14;
		void print() {
			System.out.println("\nThis is Nested class..\nvalue of variable in Nest Class = "+value_out+"\nvalue of variable in nested class = "+value_in);	
		}
	}
	void createNestedClass() {
		System.out.println("\nThis is a Nest class method...\nWill be creating another nested class...");
		class NestedInMethod{
			int value = 17;
			void printValue() {
				System.out.println("Nested class created...Value of variable = "+value);
			}
		}
		NestedInMethod newNest = new NestedInMethod();
		newNest.printValue();
	}
	//value_in cannot be resolved to a variable
	/**void print() {
		System.out.println("This is Nest class..\nvalue of variable in Nested Class = "+value_in);
	}
	**/
}

public class NestedClass {

	public static void main(String[] args) {
		Nest n = new Nest();
		n.printValue();
		n.callNested();
		System.out.println("\nCalling nested class from main..");
		Nest.Nested nested=n.new Nested(); 
		nested.print();
		
		n.createNestedClass();
		
		
	}

}
