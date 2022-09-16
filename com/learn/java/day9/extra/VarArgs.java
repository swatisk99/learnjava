package com.learn.java.day9.extra;

import java.util.Scanner;

class VarArgs {
	
	double findSum(double ... array) {
		double sum=0;
		for(double i:array) {
			sum+=i;
		}
		return sum;
	}
}
class Test{
	public static void main(String[] args) {
		System.out.println("Enter number of elements to find sum");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		double array[] = new double [size];
		System.out.println("Enter "+size+" elements : ");
		for(int i=0;i<size;i++) {
			array[i]=scan.nextDouble();
		}
		VarArgs v = new VarArgs();
		System.out.println("Sum of elements in array = "+v.findSum(array));
		
		System.out.println("Sum of 2,4,2,4,5,63,8,55,77 = "+v.findSum(2,4,2,4,5,63,8,55,77));
	}
	protected void finalize() {
		System.out.println("Entered finalize method of class VarArgs");
	}
}
