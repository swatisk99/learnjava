package com.learn.java.day7.patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = scan.nextInt();
		int i,j;
		for(i=0;i<=number;i++) {
			for(j=number;j>=1;j--) {
				if(j>i)
					System.out.print("\t");
				else
					System.out.print(j+"\t");
			}
			for(j=1;j<=i;j++)
				System.out.print(j+"\t");
			System.out.print("\n");
		}
	}

}
