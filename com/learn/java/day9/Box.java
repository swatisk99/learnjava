package com.learn.java.day9;

public class Box{
	int b,c;
	protected int d;
	private String bname;
	
	public String name;
	
	private Box() {}
	Box(int b,int c){
		this.b=b;
		this.c=c;
		d = 10;
		this.name="Swati";
	}
	
	protected Box(int d,String name){
		this.b=10;
		this.d = d;
		this.name=name;
		System.out.println("Parent");
	}
	
	public Box(int b,int c, String name){
		this(b,c);
		//this(d,name);  ==>Constructor call must be the first statement in a constructor

		this.name = name;
		d=15;
		this.bname="Krishna";
	}
	void display(Box this) {
		System.out.println(this.name);
	}
	
}
