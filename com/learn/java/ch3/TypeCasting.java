package com.learn.java.ch3;
class TypeCasting{
	public static void main(String args[]){
		System.out.println("Byte to int");
		byte byteValue = 23;
		int intValue=byteValue;
		System.out.println("byteValue and intValue " + byteValue + " " + intValue);
    		System.out.println("Int to byte");
		intValue=300;	
		byteValue = (byte) intValue;
		System.out.println("intValue and byteValue " + intValue + " " + byteValue);


		System.out.println("\ndouble to int.");
    		double doubleValue = 32.4567;
		intValue = (int) doubleValue;
		System.out.println("doubleValue and intValue " + doubleValue + " " + intValue);
		System.out.println("int to double.");
		intValue=4567;
		doubleValue=intValue;
		System.out.println("intValue and doubleValue " + intValue + " " + doubleValue);

		
		System.out.println("\nConversion of double to byte.");
		doubleValue=334.5678;
		byteValue = (byte) doubleValue;
		System.out.println("doubleValue and byteValue " + doubleValue + " " + byteValue);
		System.out.println("byte to double.");
		byteValue=127;
		doubleValue=byteValue;
		System.out.println("byteValue and doubleValue " + byteValue + " " + doubleValue);
		
		System.out.println("\n Int to float");
		intValue=23;
		float floatValue=(float)intValue;
		System.out.println("intValue and floatValue " + intValue + " " + floatValue);
		System.out.println("Float to int");
		floatValue=23.45f;
		intValue=(int)floatValue;
		System.out.println("floatValue and intValue " + floatValue + " " + intValue);
		


		System.out.println("\nInt to long");
		intValue=23;
		long l=intValue;
		System.out.println("intValue and l " + intValue + " " + l);
		System.out.println("long to int");
		l=23789000939202l;
		intValue=(int)l;
		System.out.println("l and intValue " + l + " " + intValue);


		System.out.println("\nFloat to double");
		floatValue=23.45f;
		doubleValue=floatValue;
		System.out.println("floatValue and doubleValue " + floatValue + " " + doubleValue);
		System.out.println("Double to float");
		doubleValue=23.45566789;
		floatValue=(float)doubleValue;
		System.out.println("doubleValue and floatValue " + doubleValue + " " + floatValue);



		System.out.println("\nChar to int");
		char character='s';
		intValue=character;
		System.out.println("character and intValue " + character + " " + intValue);
		System.out.println("Int to char");
		intValue=100;
		character=(char)intValue;
		System.out.println("intValue and character " + intValue + " " + character);

		System.out.println("\nInt to boolean");
		intValue=25;
		//boolean state=(boolean)intValue;	incompatible types: int cannot be converted to boolean");

		System.out.println("Boolean to int");
		boolean state=false;
    	//intValue=(int)state;   error: incompatible types: boolean cannot be converted to int");

		System.out.println("\nChar to string");
		character='s';
		//String s=(char)character;	incompatible types: char cannot be converted to String but by Character.toString() ONLY
		System.out.println("String to char");
		//s="swati";	incompatible types: String cannot be converted to char BUT by charAt() ONLY;

}}