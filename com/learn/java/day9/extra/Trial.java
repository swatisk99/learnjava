package com.learn.java.day9.extra;

public class Trial {
	static int a=0;
	Trial t;
	Trial() {
		a++;
	}
	void passObject(Trial obj) {
		obj.t = new Trial();
		for(;a<5;) {
			passObject(obj.t);
		}
		System.out.println("\n"+obj);
	}
	public static void main(String[] args) {
		Trial obj = new Trial();
		obj.passObject(obj);
		System.out.println(obj+"\t"+obj.t+"\t"+obj.t.t+"\t"+obj.t.t.t+"\t"+obj.t.t.t.t);
	}

}
