package com.learn.java.ch10;

public class A 	{
	int a,b;
	A()
	{	a=10;
		try
		{	int b=5/0;
		}
		catch(Exception e)
		{ System.out.println(e); }
	}
		
	public static void main(String args[])
	{
		A a1=new A();
System.out.println(a1.a+a1.b);		
	}

}

