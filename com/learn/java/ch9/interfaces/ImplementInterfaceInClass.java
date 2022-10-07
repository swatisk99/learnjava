package com.learn.java.ch9.interfaces;

public class ImplementInterfaceInClass{

	public static void main(String[] args) {
		
		ClassWithInterface.NestedInterface.display();
		
		ClassWithInterface.InnerImplementIface innerImplementIface = new ClassWithInterface.InnerImplementIface();
		innerImplementIface.print();

	}
}
