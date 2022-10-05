package com.learn.java.day9;
/**
 * allows to access the static members of a class without the class qualification. 
 * provides accessibility to static members of the class.
 */
import static java.lang.System.*;

public class OuterClass{
	int valueOut = 10;
	
	/**
	private Outer() {
		System.out.println("Outer Private constructor");
	}
	**/
	
	/**
	 * overriding toString() of Object.class
	 * called implicitly by println() when object of class Outer is its parameter
	 */
	public String toString() {
		return getClass().getName();
	}

	void printValue() {
		out.println("This is Outer class..\nvalue of variable in Outer Class = "+valueOut);
	}
	void callNested() {
		out.println("Calling Nested Class...\n...");
		Inner nestedClass = new Inner();
		nestedClass.print();
	}
	
	/**
	 * non static nested class
	 * @author swati-15154
	 *
	 */
	class Inner{
		int valueIn = 14;
		
		
		void print() {
			out.println("\nInner class..\nvalue of variable in Outer Class = "+valueOut+"\nvalue of variable in nested class = "+valueIn);			
		}
		
		class InnerMost{
			int innermostValue = 17;
			void print() {
				out.println("\nInner class in another inner class..\nvalue of variable in Outer Class = "+valueOut+"\nvalue of variable in Inner class = "+valueIn+"\nvalue of variable in Innermost class = "+innermostValue);	
				callNested();
			}
		}	
	}

	
	/**
	 * creating class within method
	 */
	void createNestedClass() {
		out.println("\nNest class method...\nWill be creating another nested class...");
		class Nested{
			int value = 17;
			void printValue() {
				out.println("Nested class created...Value of variable = "+value+" ");
			}
		
		}
		Nested newNest = new Nested();
		newNest.printValue();
		out.println(newNest);
		
	}
	//valueIn cannot be resolved to a variable
	
	/**void print() {
		System.out.println("This is Nest class.. value of variable in Inner Class = "+valueIn);
	}
	**/
	
	/**
	 * Creating nested static class
	 */
	public static class StaticClass{
		public static int d;
		
		public void test() {
			System.out.println("Static nested class variable : "+d);
			//System.out.println(new Outer().value_out);
		}
		public static void testing() {
			System.out.println("another static method");
			StaticClass sc= new StaticClass() {
				public void test() {
					System.out.println("anonymous inner class in static nested class");
					super.test();
				}
				{
					System.out.println("hi");
				}
			};
			sc.test();
		}	
	}
	/**
	{
	Inner newIn = new Inner();
	Inner.InnerMost newInMost = newIn.new InnerMost();
	newInMost.print();
	System.out.println(newInMost.innermostValue);
	}
	**/
}
