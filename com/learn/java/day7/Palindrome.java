package com.learn.java.day7;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number\t: ");
		long num=sc.nextLong();
		long i=num,pal=0;
		while(i>0)
		{	pal=pal*10+i%10;
			i/=10;
		}
		if(pal==num)
			System.out.print(num+" is a palindrome");
		else
			System.out.println(num+" is not a palindrome");
	}

}
