package com.learn.java.day9.extra;

public class GarbageC {

	public static void main(String[] args) {
		VarArgs v = new VarArgs();
		System.out.println(v.findSum(1,2,3,4,5));
		VarArgs w = new VarArgs();
		System.out.println(w.findSum(90-2));
		
		//v=null;
		int i=0,j;
		while(i++<1000000) 
		{	j=0;
			if(i%100000==0) {
				System.out.print(i+" ");
			}
			while(j++<10000) {}
		}
		System.gc();
		System.out.println("..");
		System.out.println(v.findSum(1,1));
	}
	/**protected void finalize() {
		System.out.println("Entered finalize method");
	}**/
}
