package com.learn.java.day7;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=s.nextInt();
		int i=1,j;
		while(i<=num)
		{	j=i;
			while(j>0) {
				System.out.print("* ");
				j--;
			}i++;
			System.out.print("\n");
		}
	}

}
