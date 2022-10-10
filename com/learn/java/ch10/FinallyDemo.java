package com.learn.java.ch10;

import java.util.Scanner;

class Finally {
	
	final int i;
	Finally(int a){
		i=a;
	}
	void sayRandom() throws IllegalAccessException{
		
		
		try {
			//int a=9/0;		//'java.lang.ArithmeticException: / by zero' is printed after "finally"
			System.out.println("Random");
			throw new IllegalAccessException("illegal");
			//System.out.println("after throwing exception");		//unreachable code
		}
		finally {	//Prints before the method returns
			System.out.println("finally");
		}
	}
	void display(final int i) {
		System.out.println(i);
		//System.out.println(a++);		//The final local variable a cannot be assigned. It must be blank and not using a compound assignment
	}
}
public class FinallyDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			new Finally(scanner.nextInt()).sayRandom();
		}
		catch(Exception e) {
			System.out.println(e);
			new Finally(12).display(0+1);
		}
		finally {
			scanner.close();
		}
	}
	

}
