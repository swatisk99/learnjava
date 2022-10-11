package com.learn.java.ch10;

public class MyException extends Exception {
//Have all methods available to Throwable. May override. 
	
	//private static final long serialVersionUID = 4122944237257270374L;	//Useful in case of serialization

	String message;
	public MyException(String name){
		message =  "Name should contain atleast 3 letters "+name;
	}
	public MyException(byte age) {
		message  = "Age should be above 18"+age;
	}
	
	public String toString() {
		
		return " ERROR : "+getClass().getName()+" : "+message;
	}
}
