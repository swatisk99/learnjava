package com.learn.java.ch10;

import java.util.Scanner;

public class MyExceptionDemo {

	public static void main(String[] args) throws MyException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		try{
			String name = scanner.nextLine();
			if(name.length() < 3) {
				throw new MyException(name);
			}
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
		System.out.println("Enter age");
		try{
			byte age = scanner.nextByte();
			if(age < 18) {
				throw new MyException(age);
			}
		}
		catch(MyException e2) {
			System.out.println(e2);

		}
		
	}

}
