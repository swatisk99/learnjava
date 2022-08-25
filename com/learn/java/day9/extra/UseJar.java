package com.learn.java.day9.extra;

import com.learn.java.day8.strings.StringOperations;

public class UseJar {

	public static void main(String[] args) {
		String s=new String("Accessed Strings.jar");
		String result=new String();
		result =  StringOperations.getUpperCase(s);
		System.out.print(s);
	}

}
