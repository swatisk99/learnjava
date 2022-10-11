package com.learn.java.ch9.interfaces;

public interface Interface1{
	int a=4;
	
	public void method1(int param);
	//String method2();

	default public void saySee() {
		System.out.println("see");
	}
	
}


