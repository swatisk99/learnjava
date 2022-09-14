package com.learn.java.day9.classtypes;

final class Hi{
	int hi = 10;
	void print() {
	System.out.print("HI"+hi);
	}
}

/**
class Hello extends Hi{
	int hello = 15;
	
}
**/

public class FinalClass {
	public static void main(String [] args) {
		Hi object = new Hi();
		object.print();
		//Hello o = new Hello();   ==> The type Hello cannot subclass the final class Hi
	}

}
