package com.learn.java.day9.classtypes;

import java.util.*;		//will be made java.util.Scanner; after compilation

final class Hi{
	int hi;
	Hi(int value){
		hi=value;
	}
	void setHi(int value) {
		hi=value;
	}
	void print() {
	System.out.println("HI"+hi);
	}
}

/**
class Hello extends Hi{
	int hello = 15;
	
}
**/

public class FinalClass {
	public static void main(String [] args) {
		Hi object = new Hi(new Scanner(System.in).nextInt());
		object.print();
		object.setHi(10);
		object.print();
		object = new Hi(1);
		Hi object2 = new Hi(new Scanner(System.in).nextInt());
		object2.print();
		//Hello o = new Hello();   ==> The type Hello cannot subclass the final class Hi
		
	
	}

}
