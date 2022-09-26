package com.learn.java.day9.classtypes;

class OuterClass{
	void print() {
		System.out.println("This is outer class");
	}
	void callAnonymousInnerClass() {
		 OuterClass anonymousInner = new OuterClass() {
			void print() {
				System.out.println("This is an anonymous inner class");
			}
		};
		print();
		anonymousInner.print();
	}
	
}
public class Anonymous {

	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.print();
		obj.callAnonymousInnerClass();
		
	}

}
