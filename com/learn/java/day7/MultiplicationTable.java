package com.learn.java.day7;
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number\t: ");
		long num=sc.nextLong();
		for(int i=1;i<=16;i++)
			System.out.println(num+" x "+i+" = "+(num*i));
	}

}
