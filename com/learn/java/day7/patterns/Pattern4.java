package com.learn.java.day7.patterns;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=s.nextInt();
		int i=0,j;
		while(i<num)
		{	j=1;
			while(j<num-i) 
			{	System.out.print("  ");
				j++;
			}
			while(j<=num)
				{	System.out.print("* ");
					j++;
				}
			i++;
			System.out.print("\n");
		}
	}
}


