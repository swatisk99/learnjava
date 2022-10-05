package com.learn.java.day9;

import com.learn.java.day9.classtypes.StudentAbstract;

/**
 * This class must implement the inherited abstract method StudentAbstract.printDetails(),
 *  but cannot override it since it is not visible from AbstractConcrete. 
 *  Either make the type abstract or make the inherited method visible
 */
public class AbstractConcrete extends StudentAbstract {
	/**
	 * The method AbstractConcrete.printDetails() does not override the inherited method  
	 * from StudentAbstract since it is private to a different package
	 */
	protected void printDetails() {
		System.out.println("Hi");
		
	}

	protected void getAge() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		StudentAbstract aobj = new AbstractConcrete();
	}
	

}
