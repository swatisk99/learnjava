package com.learn.java.day9.extra;

import com.learn.java.day8.strings.StringOperations;

public class UseJar {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Accessed Strings.jar");
		StringBuilder result=new StringBuilder();
		result =  StringOperations.getUpperCase(s);
		System.out.print(result);
	}

}
