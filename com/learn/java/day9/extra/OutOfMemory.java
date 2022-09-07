package com.learn.java.day9.extra;

public class OutOfMemory {
	static int value=1;
	public static void doNothing() {
		System.out.println(value++);
		doNothing();
		
	}
	
	public static void main(String[] args) {
		while(value>=0) {
			System.out.println(value++);
			doNothing();
		}	
		
	}
	
	
}
//in terminal type "java -Xss2m Class-name". here, Run Configurations>Arguments>VM Arguments>"-Xss2m""