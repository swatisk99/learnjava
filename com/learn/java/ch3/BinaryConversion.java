package com.learn.java.ch3;

import java.util.*;

class BinaryConversion{
	public static void main(String args[]){
		System.out.println("Enter decimal : ");
		Scanner s=new Scanner(System.in);
		int dec=s.nextInt();
		dectobin(dec);
		
	}
	public static void dectobin(int dec){
		int binary[]=new int[20];
		int top=-1, temp=dec;
		while(temp>0){
			top++;
			binary[top]=temp%2;
			temp/=2;
		}
		System.out.print("Binary : ");
		while(top>-1)
			System.out.print(binary[top--]);
	}
		
}