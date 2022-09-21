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
		System.out.println("This is Nest class.. value of variable in Inner Class = "+value_in);
	}
	**/
	
	/**
	 * Creating nested static class
	 */
	static class StaticClass{
		int d=4;
		void test() {
			System.out.println(d);
		}
		static void testing() {
			System.out.println("another static method");
		}
	}
	
}

class NestedClass {
	
	public static void main(String[] args) {
		Outer out = new Outer();
		out.printValue();
		out.callNested();
		System.out.println("\nCalling inner class from main..");
		
		/**
		 *	No enclosing instance of type Outer is accessible. 
		 *	Must qualify the allocation with an enclosing instance of type Outer. 
		 *	(e.g. x.new A() where x is an instance of Outer) 
		 **/
		//Outer.Inner nested= new Outer.Inner() ;
		Outer.Inner nested= out.new Inner() ; 
		System.out.println("created an object for inner class : "+nested);
		//nested = null;
		//System.out.println("After assigning null to Inner class object : "+nested);
		
		out.createNestedClass();	
		
		//calling static method from nested static
		Outer.StaticClass.testing();
		//calling non static method from nested static class
		Outer.StaticClass sC = new Outer.StaticClass();
		sC.test();
	} 
}
