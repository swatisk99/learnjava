package com.learn.java.day7.patterns;
import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=s.nextInt();
		int row=1,column,k;
		while(row<=(num)){
			column =1;
			while(column<=row) {
					System.out.print(column+" ");column++;
			}
			while(column<=num) {
					System.out.print("  ");column++;
			}row++;
		System.out.print("\n");
		}	
		while(row<=(num*2-1)){
			column=1;
			while(column<=(num*2-row)) {
					System.out.print(column+" ");column++;
				}
			while(column<=num) {
					System.out.print("  ");column++;
				}row++;
			System.out.print("\n");
				
		}
	}
}


