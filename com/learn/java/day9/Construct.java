package com.learn.java.day9;
class Box{
	int b,c,d;
	String bname;
	String name;
	Box(int b,int c){
		this.b=b;
		this.c=c;
		this.name="swati";
	}
	Box(int b,String name){
		this.b=b;
		this.name=name;
	}
	Box(int b,int c, String name){
		this(b,c);
		this.bname="barun";
	}
	long getProduct() {
		return b*c;
	}
}
public class Construct {

	public static void main(String[] args) {
		Box b1=new Box(23,45);
		System.out.println(b1.getProduct()+" "+b1.name);
		Box b2=new Box(23,"krishna");
		System.out.println(b2.c+" "+b2.b+" "+b2.name);
		Box b3=new Box(22,17,"swati");
		System.out.print(b3.c+" "+b3.b+" "+b3.name+" "+b3.bname);
	}

}
