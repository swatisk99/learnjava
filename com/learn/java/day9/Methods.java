package com.learn.java.day9;

public class Methods {
	private static void sumValues(int c,int d) {
		System.out.println(c+d);
	}
	private static void sumValues(char c,int d) {
		System.out.println((char)(c+d));
	}
	
	/**
	 * private static void sumValues(int c, char d) {
	 * System.out.println(c+d);
	 * }
	 * will confuse the compiler because of ambiguity
	**/
	
	
	public static void main(String[] args) {
		sumValues('a','b');
		sumValues(12,'b');
		
		
	}

}
