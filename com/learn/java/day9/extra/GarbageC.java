package com.learn.java.day9.extra;

import java.util.Scanner;

public class GarbageC {

	public static void main(String[] args) {
		VarArgs v = new VarArgs();
		System.out.println(v.findSum(1,2,3,4,5));
		VarArgs w = new VarArgs();
		System.out.println(w.findSum(90-2));
		v=null;w=null;

		int i=0,j;
		while(i++<1000000) 
		{	j=0;
			while(j++<10000) {}
		}
		System.gc();
		System.out.println("..");
	}
	/**protected void finalize() {
		System.out.println("Entered finalize method");
	}**/
}
