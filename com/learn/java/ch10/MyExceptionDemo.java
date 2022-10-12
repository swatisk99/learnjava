package com.learn.java.ch10;

import java.util.Scanner;

public class MyExceptionDemo {
	static Scanner scanner = new Scanner(System.in);
	
	public static String getValidName() throws NamingException {
		String name = scanner.nextLine();
		return validateName(name);
	}
	public static String validateName(String name) throws NamingException{
		try{	
			if(name.length() < 3) {
				throw new NamingException("Name should have atleast 3 letters!!");
			}
			if(name.split(" ").length < 2) {
				throw new NamingException("Enter full name!!");
			}
			return name;
		}
		catch(Exception e) {
			System.out.println(e);
			return getValidName();
		}
	}
	public static Byte getValidAge() {
		byte age = scanner.nextByte();
		return validateAge(age);
	}
	public static byte validateAge(byte age){
		if(age<0) {
			throw new InvalidAgeException("Age can't be negative");
		}
		if(age>100) {
			throw new InvalidAgeException("Enter realistic age");
		}
		return age;
	}
	
	public static void main(String[] args) {
		//try with resources
		String name=null;
		byte age;
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter name");
			try{
				name = getValidName();
				
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Enter age");
			try{
				age = getValidAge();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println(name);
	}

}
