package com.learn.java.day4;
import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		float a;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		a=scan.nextInt();
		if((a%2)==1)
			System.out.println("Odd");
		else
			System.out.println("even");
		}

}
