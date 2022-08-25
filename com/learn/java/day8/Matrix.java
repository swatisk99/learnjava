package com.learn.java.day8;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		System.out.print("Enter size of matrix(n and m) : ");
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int column=s.nextInt();
		long [][] matrix=new long [row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {	
				System.out.print("matrix["+i+"]["+j+"] -> ");
				matrix[i][j]=s.nextLong();
			}
		}System.out.println("\nMatrix : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {	
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.print("Find position of which number : ");
		long number=s.nextLong();
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {
				if(number==matrix[i][j])
					System.out.print(number+" is in "+(i+1)+"th row and "+(j+1)+"th column\n");
			}
		}
	}
}
