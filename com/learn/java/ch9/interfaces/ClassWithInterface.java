package com.learn.java.ch9.interfaces;

public class ClassWithInterface {
	public interface NestedInterface{
		public void print();
		public static void display() {
			System.out.println("Nested interface of \'ClassWithInterface.java\'");
		}
	}
	
	public static class InnerImplementIface implements NestedInterface{
		public void print() {
			System.out.println("Nested interface of \'ClassWithInterface.java\' implemented by Static nested class");
		}
	}
}


