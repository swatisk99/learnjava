package com.learn.java.day9;

import java.util.Scanner;

class Thing{
	private long height;
	Thing(long h){
		height=h;
	}
	/**
	 * Method to create objects
	 * @param h->height
	 * @return the created object
	 */
	static Thing createObject(long h) {
		return new Thing(h);
	}
	long printHeight() {
		return height/100;
	}
}
public class SetDimensions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.print("Enter height(cm)  : ");
			Thing obj=Thing.createObject(s.nextLong());
			System.out.println("Object "+i+"has height : "+obj.printHeight()+"m");
		}
		s.close();
	}

}
