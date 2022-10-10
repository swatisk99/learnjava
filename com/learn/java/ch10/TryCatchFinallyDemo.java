package com.learn.java.ch10;

import java.util.Scanner;

class NestedTry {
	
	void printHashcode(String s) {
		System.out.println(s.hashCode());
	}
	void sayRandom() throws IllegalAccessException{
		
		//Nested try
		try {
			//int a=9/0;		//'java.lang.ArithmeticException: / by zero' is printed after "finally"
			System.out.println("Random");
			try {
				throw new IllegalAccessException("illegal");
				//System.out.println("after throwing exception");		//unreachable code

			}
			finally {
				System.out.println("Returning from nested try in sayRandom()");
				try {
					String s=null;
					printHashcode(s);	//
				}
				catch(ArrayIndexOutOfBoundsException aioobe) {
					System.out.println(aioobe);
				}
				
				
				//On commenting the below catch block,ONLY the catch block corresponding 
				//to the NullPointerException in the main method will be executed
				catch(NullPointerException npe) {
					System.out.println("Null Pointer");
				}
			}
		}
		catch(IllegalAccessException iae) {
			System.out.println(iae+" "+iae.hashCode());
		}
}
	void display(final int i) {
		System.out.println(i);
		//System.out.println(a++);		//The final local variable a cannot be assigned. It must be blank and not using a compound assignment
	}
}


public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			NestedTry obj = new NestedTry();
			obj.sayRandom();
			System.out.println("1..");	//If exception caught in previous lines, this line will not be printed since program control transferred to catch block.
		}
		catch(Exception e) {
			System.out.println(e);
			new NestedTry().display(scanner.nextInt());
		}
		finally {
			scanner.close();
		}
	}
	

}
