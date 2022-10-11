package com.learn.java.ch10;

/**
 * Used to find underlying cause of exceptions
 * Offer elegant solution
 * @author swati-15154
 *
 */
public class ChainedExceptions {
	public static void callMethod() {
		try {
			int [] array = new int [-2];
		}
		catch(Exception e1) {
			System.out.println("Array size can NEVER be negative");
			int [] array2 = {1};
			try {
				array2[1] = 2;
			}
			catch(Exception e2) {
				//returns a reference to exception e1..causeExc of Exception class 
				e2.initCause(e1);
				
				//getCause( ) method returns the exception that underlies the current exception. 
				System.out.println(e2+" is caused by "+e2.getCause());
				//e2.printStackTrace();
				try {
					int a=0;
					int d=40/a;
				}
				catch(Exception e3) {
					e3.initCause(e2);
					System.out.println(e3+" is caused by "+e3.getCause());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			callMethod();
		}
		finally {
			System.out.println(". . .");
		}
	}

}
