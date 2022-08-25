package com.learn.java.day8;
import java.util.Scanner;

public class MatrixType {

	public static void main(String[] args) {
		System.out.print("Enter size of square matrix(m and m) : ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		long [][] matrix=new long [size][size];
		boolean isDiagonal=true,isScalar=true;
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++) {	
				System.out.print("matrix["+i+"]["+j+"] -> ");
				matrix[i][j]=s.nextLong();
				if((i!=j)&&(matrix[i][j]!=0))
						isScalar=isDiagonal=false;
			}
		}System.out.println("\nMatrix : ");
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++) {	
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
		long scalarNumber=matrix[0][0];
loopExit:{		if(!isDiagonal)
		{	System.out.print("Neither Diagonal nor Scalar nor Identity matrix");	}
		else {
				int i=0;
				while(i<size)
				{	isScalar=matrix[i][i++]==scalarNumber?true:false;
					if(!isScalar) {
						System.out.print("Diagonal matrix");
						break loopExit;
					}
				}if(scalarNumber==1)
					System.out.print("Identity matrix");
				else
					System.out.print("Scalar matrix");
			}
		}
	}
}
