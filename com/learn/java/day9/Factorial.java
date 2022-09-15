package com.learn.java.day9;

import java.util.Scanner;

public class Factorial {
	static long getFactorial(int n) {
		if(n==1) {
			return 1;
		}
		return getFactorial(n-1)*n;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number to find factorial : ");
		int number = scan.nextInt();
		System.out.println(number+"! = "+getFactorial(number));
	}
	

}
