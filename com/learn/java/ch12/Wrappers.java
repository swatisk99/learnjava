package com.learn.java.ch12;

public class Wrappers {
	static float passToMethod(Float f) {
		//System.out.println(-0.000002);
		return f;
	}
	public static void main(String[] args) {
			Boolean flag = new Boolean(true);
			System.out.println(flag+" "+flag.booleanValue());	//toString() is overridden
//			flag = new Boolean("TRUE");		//true
//			flag = new Boolean("TrUE");		//true
//			flag = new Boolean("true");		//true
//			flag = new Boolean("truee");	//false
//			System.out.println(flag);	
			flag = true;					//autoboxing
			System.out.println(flag.getClass().getName());
			boolean booleanVal = flag;		//auto-unboxing
			Integer integer = new Integer(1);
			System.out.println(integer);
			integer = new Integer("12");
//			integer = new Integer("1.0");	//NumberFormatException
//			integer = new Integer(1.0);		//The constructor Integer(double) is undefined
			integer = 123;
			System.out.println(integer);
			Byte byteVal = 12/3;
			//byteVal = new Byte("1234");	//NumberFormatException: Value out of range. Value:"1234" Radix:10
			System.out.println(byteVal);
			Float floatVal = new Float("2.3");
			floatVal = new Float("2.35f");
			floatVal = new Float("-2e-3");
			//Autoboxing in methods..
			System.out.println(passToMethod(floatVal));
//			floatVal = new Float("2.3.4");	//NumberFormatException: multiple points
			System.out.println(floatVal);
			Double dVal = (double)floatVal;
			System.out.println(dVal);
//			floatVal = (float)(double)dVal;
//			System.out.println(floatVal);
			//Autoboxing in expressions..
//			Automatic unboxing to perform below operations			
			double product = dVal * integer;	
//			auto reboxing 
			dVal = dVal + integer;
			System.out.println(product+" "+dVal);
			// unboxed into its boolean equivalent
			System.out.println(booleanVal ? "TRUEEE":"FALSE!");
			integer = 257;
			byte b = integer.byteValue();
			int i = integer.byteValue();
			int j = integer.intValue();
			System.out.println(b+" "+i+" "+j);
			
	}
}
