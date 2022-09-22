package com.learn.java.day9.extra;

import java.util.Scanner;

class Class{
	final int VAR;
	/**
	 * Class(){}			The blank final field VAR may not have been initialized
	 */
	
	Class(int finalValue){
		VAR = finalValue;
	}
	/**void setFinalValue(int finalValue) {
		this.VAR=finalValue;
	}**/
}
public class Final {

	public static void main(String[] args) {
	Class c1 = new Class(10);
	Class c2 = new Class(12);
	Scanner scan = new Scanner(System.in);
	Class c3 = new Class(scan.nextInt());
	//Class c4 = new Class();
	//c4.setFinalValue(111);		The final field Class.VAR cannot be assigned

	System.out.println(c1.VAR+" "+c2.VAR+" "+c3.VAR);
	}
}
