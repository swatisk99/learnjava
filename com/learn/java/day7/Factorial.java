package com.learn.java.day7;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number");
		int num = sc.nextInt();
		int fact=num;
		int temp=num;
		if(num==0)
			System.out.print(num +"! = 1");
		else if(num<0)
			System.out.print("enter number > 0");
		else {
			do{
				fact*=(--temp);
			}while(temp>1);
			System.out.print(num +"! = "+fact);
		}
		
	}

}
