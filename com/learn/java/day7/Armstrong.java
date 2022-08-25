package com.learn.java.day7;
import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
	static void findIfArmstrong(int number) {
		int i=number,j=number,armstrong=0,digits=0;
		while(j>0)
		{	digits++;
			j/=10;
		}
		while(i>0)
		{	armstrong+=Math.pow(i%10,digits);
			i/=10;
		}
		if(armstrong==number)
			System.out.print(number+" is an Armstrong number");
		else
			System.out.println(number+" is not Armstrong number");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number\t: ");
		int number=sc.nextInt();
		int i,j,armstrong;
		findIfArmstrong(number);
		
		System.out.println("\nArmstrong numbers from 100 to 999 : ");	
		for(j=100;j<=999;j++)
		{	i=j;
			armstrong=0;
			while(i>0)
			{	armstrong+=Math.pow(i%10,3);
				i/=10;
			}
			if(armstrong==j)
				System.out.print(armstrong+"  ");
			
		}
	}

}
