package com.learn.java.day9;

import com.learn.java.day9.Outer.StaticClass;

class Outer{
	int value_out = 10;
	
	/**
	 * overriding toString() of Object.class
	 * called implicitly by println() when object of class Outer is its parameter
	 */
	public String toString() {
		return getClass().getName();
	}

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
		
		class InnerMost{
			int innermostValue = 17;
			void print() {
				System.out.println("\nThis is an Inner class in another inner class..\nvalue of variable in Nest Class = "+value_out+"\nvalue of variable in Inner class = "+value_in+"\nvalue of variable in Innermost class = "+innermostValue);	
				callNested();
			}
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
		System.out.println(newNest);
		
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
		int d;
		
		void test() {
			System.out.println(d);
			//System.out.println(new Outer().value_out);
		}
		static void testing() {
			System.out.println("another static method");
			StaticClass sc= new StaticClass() {
				void test() {
					System.out.println("this is an anonymous inner class in static nested class");
					super.test();
				}
				{
					System.out.println("hi");
				}
			};
			sc.test();
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
		System.out.println(out);
		
		
		//Outer.Inner nested= new Outer.Inner() ;
		Outer.Inner nested= out.new Inner() ; 
		System.out.println("created an object for inner class : "+nested);
		//nested = null;
		//System.out.println("After assigning null to Inner class object : "+nested);
		
		Outer.Inner.InnerMost innermostNested = nested.new InnerMost();
		innermostNested.print();
		System.out.println("created an object for innermost class : "+innermostNested+"\n\n");
		
		out.createNestedClass();	
		
				
		//calling non static method from nested static class
		StaticClass staticClass = new StaticClass();
		staticClass.test();
		//calling static method from nested static
		Outer.StaticClass.testing();
	} 
}
