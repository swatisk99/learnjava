package com.learn.java.day9;

public class NestedClass {
	static{
		System.out.println("Main class");
	}
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		out.printValue();
		out.callNested();
		System.out.println(out);

		System.out.println("\nCalling inner class from main..");
		
		/**
		 * Outer.Inner inObj = new Outer.Inner();	
		 *	No enclosing instance of type Outer is accessible. 
		 *	Must qualify the allocation with an enclosing instance of type Outer. 
		 *	(e.g. x.new A() where x is an instance of Outer) 
		 **/
			
		//Outer.Inner nested= new Outer().new Inner() ;
		OuterClass.Inner nested= out.new Inner() ; 
		System.out.println("created an object for inner class : "+nested);
		//nested = null;
		//System.out.println("After assigning null to Inner class object : "+nested);
		
		OuterClass.Inner.InnerMost innermostNested = nested.new InnerMost();
		innermostNested.print();
		System.out.println("created an object for innermost class : "+innermostNested+"\n\n");
		
		out.createNestedClass();	
				
		//calling non static method from nested static class
		OuterClass.StaticClass staticClass = new OuterClass.StaticClass();
		staticClass.test();
		//calling static method from nested static
		OuterClass.StaticClass.testing();
		
	} 
}
