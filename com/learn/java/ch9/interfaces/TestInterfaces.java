package com.learn.java.ch9.interfaces;

/**
 * This class implements methods of I1 and I2 where they both have method2 with different return types.
 * Class also has its own method
 * @author swati-15154
 *
 */
class IfaceImplement implements Interface1,Interface2 {
	public void method1(int p) {
	    System.out.println("callback called with " + p);
	  }
	public void nonIfaceMeth() {
	    System.out.println("Classes that implement interfaces "+"may also define other members, too.");
	 }
	 
	@Override
	public void method3() {
		System.out.println("Implementing Interface2");
	}
	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 0;
	} 
	/** Override equivalence ..duplicate method */
	/**
	 * 	public String method2() {
		return null;
	}
	*/
}

/**
 * This class implements method1(of interface1) and method2 of Interface3
 * The class which implements a child interface needs to provide code for 
 * the methods defined in both child and parent interfaces, otherwise, it needs to be defined as abstract class.
 * @author swati-15154
 */
class AnotherImplementation implements Interface3{

	@Override
	public void method1(int param) {
		System.out.println(Interface1.a);
		//Interface1.a++;		//ERROR : The final field Interface1.a cannot be assigned => implicitly static final
		System.out.println(Interface3.a);
	}

	@Override
	public void method2() {
		System.out.println("Method2");
	}

	
	
}

public class TestInterfaces {
	public static void main(String args[]) {
		Interface1 obj1 = new IfaceImplement();
		Interface2 obj2 = new IfaceImplement();
	    obj1.method1(42);
	    //obj1.method2();		//error. since no method2 in Interface1
	    
	    obj2.method1(42);
	    obj2.method2();
	    obj2.method3();
	    
	    IfaceImplement obj3 = new IfaceImplement();
	    obj3.method1(23);
	    
	    Interface1 obj4 = new AnotherImplementation();
		Interface3 obj5 = new AnotherImplementation();
	    obj4.method1(42);
	    obj5.method1(0);
	    obj5.method2();
	    AnotherImplementation obj6 = new AnotherImplementation();
	    obj6.method1(0);
	    obj6.method2();
	  }	
}


