package com.learn.java.ch9.a;

class IfaceImplement implements Interface1,Interface2 {
	 public void method1(int p) {
	    System.out.println("callback called with " + p);
	  }
	 void nonIfaceMeth() {
	    System.out.println("Classes that implement interfaces "+"may also define other members, too.");
	 }
	@Override
	public void method2() {
		System.out.println("Implementing Interface2");
	} 
}



public class TestInterfaces {
	public static void main(String args[]) {
		Interface1 obj1 = new IfaceImplement();
		Interface2 obj2 = new IfaceImplement();
	    obj1.method1(42);
	    //obj1.method2();		error
	    obj2.method1(42);
	    obj2.method2();
	  }	
}


