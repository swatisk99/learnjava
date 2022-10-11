package com.learn.java.ch9.abstracts;

import com.learn.java.ch9.*;

public class ConcreteParentAbstractChild extends AbstractChild{
	//This class must implement the inherited abstract method AbstractChild.show(), 
	//but cannot override it since it is not visible from ConcreteParentAbstractChild.
	//Either make the type abstract or make the inherited method visible	
	
	public static void main(String ...args) {
		ConcreteParentAbstractChild object1 = new ConcreteParentAbstractChild();
		object1.print();
		
		ConcreteParent object2 = new ConcreteParentAbstractChild();
		object2.print();
		//object2.displayMessage();
	}
	
	
	@Override
	public void displayMessage() {
		System.out.println("Overrides \'displayMessage()\' of abstract parent");
	}

	/**
	 * Since abstract class overrides parent method with abstract method , it must be implemented...
	 * No real life examples seen so far... Not a common practice.
	 */
	@Override
	public void print() {
		System.out.println("concrete child");
		//super.print();		Cannot directly invoke the abstract method print() for the type AbstractChild
	}
}
