package com.learn.java.ch10;

import java.util.Scanner;

public class SuppressedExceptions {
	static void callAnotherMethod() {
		int a [] =new int [1];
		a[3] = 8;
	}

	static void callMethod() {
		try {
			callAnotherMethod();
		}
		//Exception thrown in try block is suppressed by Exception thrown by finally block
		finally {
			int a=9/0;
		}
	}
	
	public static void main(String[] args) {
		
		try {
			callMethod();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
