package com.learn.java.day9.extra;
import static com.learn.java.day9.extra.FirstClass.*;
//import static com.learn.java.day9.SecondClass.*;
public class ThirdClass {
	public static void anotherMethod() {
		System.out.println("Third Class");
	}
	
	public static void main(String[] args) {
		//oneMethod();				The method oneMethod() is ambiguous for the type ThirdClass
		oneMethod();
	}

}
