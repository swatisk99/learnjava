package com.learn.java.ch10;

public class InstantiationException{
	public static void callMethod() throws java.lang.InstantiationException{
		try {
			//Object b = InstantiationException.newInstance();		//com.learn.java.ch10.InstantiationException.main(InstantiationException.java:9)
			throw new java.lang.InstantiationException("Cannot instantiate");
		}
		finally {
			System.out.println("Returning to main");
		}
	}
	
	public static void main(String[] args) throws java.lang.InstantiationException{
		try {
			callMethod();
		}
		catch(java.lang.InstantiationException e) {
			System.out.println("ERROR : "+e.getMessage());
			//e.printStackTrace();
			//throw e;
		}
		finally {
			System.out.println("Printed error");
		}
	}
}
