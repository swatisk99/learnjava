package com.learn.java.ch10;

//import com.learn.java.ch9.AbstractChild;

public class InstantiationException extends Exception{
	public static void callMethod() throws java.lang.InstantiationException{
		try {
			//AbstractChild obj = new AbstractChild();		//com.learn.java.ch10.InstantiationException.main(InstantiationException.java:9)
			throw new java.lang.InstantiationException("Cannot instantiate");
		}
		finally {
			System.out.println("Returning to main");
		}
	}
	
	public static void main(String[] args){
		try {
			callMethod();
		}
		catch(java.lang.InstantiationException e) {
			System.out.println("ERROR : "+e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Printed error");
		}
	}
}
