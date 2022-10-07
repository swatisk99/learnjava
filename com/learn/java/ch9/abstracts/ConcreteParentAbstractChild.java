package com.learn.java.ch9.abstracts;

import com.learn.java.ch9.*;

public class ConcreteParentAbstractChild extends AbstractChild{
	
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
}
