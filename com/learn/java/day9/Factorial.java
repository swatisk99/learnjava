package com.learn.java.day9;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	//static final BigInteger ONE = new BigInteger("1");
	static BigInteger getFactorial(BigInteger number) {
		
		if(number.equals(BigInteger.ONE)) {
			return BigInteger.ONE;
		}
		return getFactorial(number.subtract(BigInteger.ONE)).multiply(number);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number to find factorial : ");
		BigInteger number = scan.nextBigInteger();
		System.out.println(number+"! = "+getFactorial(number));	
	}
	

}
