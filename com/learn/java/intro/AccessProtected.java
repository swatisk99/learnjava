package com.learn.java.intro;

import com.learn.java.day9.Box;

public class AccessProtected extends Box {
	AccessProtected(int d,String name){
		super(d,name);
		System.out.println("Child");
	}
	public static void main(String[] args) {
		AccessProtected b = new AccessProtected(23,"Swati");
		System.out.println(b.d+" "+b.name);
		//Accessing default variable from outside the package
		//System.out.println(b.b);
	}

}
