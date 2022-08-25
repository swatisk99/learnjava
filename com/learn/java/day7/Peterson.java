package com.learn.java.day7;
import java.util.Scanner;

public class Peterson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number");
		int num = sc.nextInt();
		int i=num,j,factsum=0,fact=1;
		while(i>0)
		{	j=i%10;
			i/=10;
			fact=1;
			while(j>0)
			{	fact*=j--;
			}	
			factsum+=fact;
		}
		if(factsum==num)
			System.out.print(num+" is a Peterson number");
		else
			System.out.print(num+" is not a Peterson number");
	}

}
