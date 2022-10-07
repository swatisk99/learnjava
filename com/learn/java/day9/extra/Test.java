package com.learn.java.day9.extra;

import java.util.Scanner;

class VarArgs {
	int randomValue;
	void findSum(VarArgs...objects) {
		System.out.println("VarArgs array");
	}
	double findSum(double ... array) {
		double sum=0;
		for(double i:array) {
			sum+=i;
		}
		return sum;
	}
	//double test(double ... array,int a) {}		===> The variable argument type double of the method test must be the last parameter
	//double test(int ...a,double ... array) {}		===> only 1 vararg parameter
	
	double findSum(double a,double b) {
		System.out.println(".......");
		return a+b;
	}
	
	double findSum(byte a,double ... array) {
		double sum=0;
		for(double i:array) {
			sum+=i;
		}
		System.out.println("this one");
		return sum;
	}
	
	double findSum(byte a,byte ... array) {
		double sum=0;
		for(double i:array) {
			sum+=i;
		}
		System.out.println("this one");
		return sum;
	}
	
	/**
	 * Overloading methods with variable number of characters
	 * @param array
	 * @return sum
	 */
	long findSum(char ... array) {
		long sum=0;
		for(char i:array) {
			sum+=i;
		}
		return sum;
	}
	
	/**
	 * will cause ambiguity issues
	 */
	long findSum(char a,char ... array) {
		long sum=0;
		for(char i:array) {
			sum+=i;
		}
		return sum;
	}
	
	protected void finalize() {
		System.out.println("Entered finalize method of class VarArgs");
	}
}
class Test{
	public static void main(String ... args) {
	
		VarArgs v = new VarArgs();
		
		System.out.println("Enter number of elements to find sum");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		double array[] = new double [size];
		System.out.println("Enter "+size+" elements : ");
		for(int i=0;i<size;i++) {
			array[i]=scan.nextDouble();
		}
		//Passing an array
		System.out.println("Sum of elements in array = "+v.findSum(array));
		//System.out.println("Sum of elements in array = "+v.findSum());

		System.out.println("Sum of 2,4,2,4,5,63,8,55,77 = "+v.findSum(2,4,2,4,5,63,8,55,77));
		//The method findSum(double[]) is ambiguous for the type VarArgs
		//System.out.println("Sum of a,b,c,d,e,f = "+v.findSum('a','b','c','d','e','f'));
		System.out.println("Sum of elements in array = "+v.findSum(1.789987,2.79879));
		byte a=1,b=2;
		System.out.println(v.findSum((byte)a,(byte)b));
		v.findSum(null,new VarArgs(),null);
			}
	
}
