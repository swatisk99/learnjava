package com.learn.java.ch10;


import java.util.Scanner;

class MultipleCatches {
	
	void print(String s) {
		System.out.println(s.hashCode());
	}
	
	void sayNestedTry() throws IllegalAccessException,CloneNotSupportedException{
		int [] array = {0};
		String name="Swati";
		//Nested try
		try {	//uncomment below lines one at a time
			System.out.println("First try block in sayNestedTry() method");
			array[1]  = 32;
			int array2[]= new int [-1];
			System.out.println(name.charAt(5));
			throw new IllegalAccessException("illegal");
			
		}
		finally {
			System.out.println("Returning to main method");
		}
	}
}


public class MultipleCatchesDemo {
	
	public static void main(String[] args) {
		try {
			MultipleCatches obj = new MultipleCatches();
			obj.sayNestedTry();
		}
		//Multiple catches
		//After one catch statement execute others are bypassed
		catch(IllegalAccessException iae) {
			System.out.println(iae);
		}
		catch(ArithmeticException ae) {
		 	System.out.println(ae);
		 }
		catch(NullPointerException ne) {
			System.out.println(ne+" "+ne.getMessage());
		}
		catch(CloneNotSupportedException cnse) {
			System.out.println("Must implement");
		}
		catch(NegativeArraySizeException nase) {
			System.out.println("Array size can NEVER be negative");
		}
		catch(ArrayIndexOutOfBoundsException aieoob) {
			System.out.println("Trying to access index "+aieoob.getMessage()+" of array which is greater than array length");
		}
		//ArrayIndexOutOfBoundsException subclass of IndexOutOfBoundsException
		catch(IndexOutOfBoundsException ieoob) {
			System.out.println("Trying to access index "+ieoob.getMessage()+" of string which is not within array size limits");
		}
		catch(NumberFormatException nfe) {
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		/**
		 * Unreachable catch block for ArithmeticException. 
		 * It is already handled by the catch block for Exception
		 * subclasses must be mentioned before superclass
		 */
		/**
		 catch(ArithmeticException ae) {
		 	System.out.println(ae);
		 }
		 */
	}
	

}
