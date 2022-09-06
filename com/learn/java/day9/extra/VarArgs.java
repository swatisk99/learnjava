package com.learn.java.day9.extra;

import java.util.Scanner;

public class VarArgs {
	static double findSum(double ... array) {
		double sum=0;
		for(double i:array) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter number of elements to find sum");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		double array[] = new double [size];
		System.out.println("Enter "+size+" elements : ");
		for(int i=0;i<size;i++) {
			array[i]=scan.nextDouble();
		}
		System.out.println("Sum of elements in array = "+findSum(array));
		
		System.out.println("Sum of 2,4,2,4,5,63,8,55,77 = "+findSum(2,4,2,4,5,63,8,55,77));
	}

}
