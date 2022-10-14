package com.learn.java.ch10;

import java.util.*;

public class MyExceptionDemo {
	static byte iterations = 1;
	static Scanner scanner = new Scanner(System.in);
	/**
	 * Takes name as input, checks if name is null or has only spaces. If so, gives upto 3 attempts to enter name. 
	 * <code>name</code> passed to <code>validateName()</code> to check validity of name.
	 * @param args
	 * @throws NamingException
	 */
	public static String getValidName() throws NamingException {
		System.out.print("Enter valid name : ");
		String name = scanner.nextLine();
			if(name==null || name.length()==0 || name.split(" ").length == 0) {
				do {
					System.out.print("\nName empty!!! You have "+(4-iterations)+" attempts left.\nEnter valid name : ");
					name=scanner.nextLine();
					if (name!=null && name.split(" ").length != 0 && name.length()!=0 ) {
						validateName(name);
						return name;
					}
				}while(iterations++ < 3);
				throw new NamingException("Did not enter valid(non-empty) name in 3 attempt(s)"+name);
			}
			System.out.println(name.split(" ").length);
			validateName(name);
			return name;
	}
		

		
	
	public static boolean validateName(String name) throws NamingException{	
		if(name.length() < 3) {
				throw new NamingException("Name should have atleast 3 letters!!");
		}
		if(name.split(" ").length < 2) {
				throw new NamingException("Enter full name!!");
		}
		checkIfOnlyLetters(name);
		return true;
	}

	public static boolean checkIfOnlyLetters(String name) throws NamingException {
		for(char letter : name.toCharArray()) {
			if((letter>122)||((letter<65) && (letter!=' '))||((letter>90)&&(letter<97))) {
				throw new NamingException("Name contains special characters!!!");
			}
		}
		return true;
	}
	
	public static byte getValidAge() {
		try{
			System.out.println("Enter age : ");
			byte age = scanner.nextByte();
			validateAge(age);
			return age;
		}
		catch(InputMismatchException ime) {
			throw new InvalidAgeException(ime);
		}
	}
	public static boolean validateAge(byte age){
		if(age<0) {
			throw new InvalidAgeException("Age can't be negative");
		}
		if(age>100) {
			throw new InvalidAgeException("Enter realistic age");
		}
		return true;
	}
	
	public static void main(String[] args) throws NamingException {
		String name;
		byte age;
		try{
			name = getValidName();
			age = getValidAge();
			System.out.println(name+" is "+age+" years old.");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			scanner.close();
		}
	}
}
