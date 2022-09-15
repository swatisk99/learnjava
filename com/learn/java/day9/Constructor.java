package com.learn.java.day9;

public class Constructor {

	public static void main(String[] args) {
		Box b1=new Box(23,45);
		System.out.println(b1.getProduct()+" "+b1.name);
		Box b2=new Box(23,"krishna");
		System.out.println(b2.c+" "+b2.b+" "+b2.name);
		Box b3=new Box(22,17,"swati");
		System.out.print(b3.c+" "+b3.b+" "+b3.name+" "+b3.d);
	}

}
