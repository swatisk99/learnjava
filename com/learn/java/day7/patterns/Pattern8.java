package com.learn.java.day7.patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=s.nextInt();
		int i,j,val=1;
		System.out.print("Enter Increment Order : ");
		int increment=s.nextInt();
		for(i=0;i<=num;i++) {
			for(j=num-1;j>=1;j--) {
				if(j<i)
					System.out.print((j*increment+1)+"\t");
				else
					System.out.print("\t");
			}
			for(j=0;j<i;j++) {
				if(j<i)
					System.out.print((j*increment+1)+"\t");
				else
					System.out.print("\t");
			}
			System.out.print("\n");
		}
		for(i=num-1;i>=1;i--) {
			for(j=num-1;j>=0;j--) {
				if(j<i)
					System.out.print((j*increment+1)+"\t");
				else
					System.out.print("\t");
			}
			
			for(j=1;j<i;j++) {
				System.out.print((j*increment+1)+"\t");
			}
			System.out.print("\n");
		}
		
	}

}
