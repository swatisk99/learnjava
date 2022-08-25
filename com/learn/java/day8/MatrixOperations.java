package com.learn.java.day8;
import java.util.Scanner;

public class MatrixOperations {
	
	public static long[][] getMatrixSum(long matrix1[][], long matrix2[][]){
		int row=matrix1.length;
		int column=matrix1[0].length;
		long sumMatrix[][] = new long [row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {	
					sumMatrix[i][j]= matrix1[i][j]+matrix2[i][j];
			}
		}
		return sumMatrix;
	}
	
	public static long[][] getMatrixProduct(long matrix1[][], long matrix2[][]){
		int row=matrix1.length, column=matrix2[0].length;
		long [][] productMatrix=new long [row] [column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {	
				productMatrix[i][j]=0;
				for(int k=0;k<column;k++) {
					productMatrix[i][j]=productMatrix[i][j]+(matrix1[i][k]*matrix2[k][i]);	}
			}	
		}
		return productMatrix;
	}
	
	public static void printMatrix(long matrix[][]) {
		int row=matrix.length, column=matrix[0].length;
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {	
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
	}
	
	public static void checkMatrixEquality(long matrix1[][], long matrix2[][]) {
		int row=matrix1.length, column=matrix1[0].length;
		boolean isEqual=true;
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {	
					if(matrix1[i][j]!=matrix2[i][j]) {
						isEqual=false;
						break;
					}	
			}
		}
		if(isEqual)
			System.out.println("\nMatrices are equal");
		else
			System.out.println("\nMatrices are not equal");
	}
	
	public static long [][] getTransposeMatrix(long matrix[][]) {
		int row=matrix.length, column=matrix[0].length;
		long transposeMatrix[][] =new long [column][row];
		for(int i=0;i<column;i++){			
			for(int j=0;j<row;j++) {	
					transposeMatrix[i][j]= matrix[j][i];
			}
		}	
		return transposeMatrix;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter size of matrix1(n and m) : ");
		Scanner s=new Scanner(System.in);
		int row1=s.nextInt();
		int column1=s.nextInt();
		long [][] matrix1=new long [row1][column1];
		for(int i=0;i<row1;i++){
			for(int j=0;j<column1;j++) {	
				System.out.print("matrix1["+i+"]["+j+"] -> ");
				matrix1[i][j]=s.nextLong();
			}
		}
		
		System.out.print("Enter size of matrix2(n and m) : ");
		int row2=s.nextInt();
		int column2=s.nextInt();
		long [][] matrix2=new long [row2][column2];
		for(int i=0;i<row2;i++){
			for(int j=0;j<column2;j++) {	
				System.out.print("matrix2["+i+"]["+j+"] -> ");
				matrix2[i][j]=s.nextLong();
			}
		}
		//Matrix PRINT
		System.out.println("\nMatrix1 : ");
		printMatrix(matrix1);
		System.out.println("\nMatrix2 : ");
		printMatrix(matrix2);
		
		//Matrix EQUALITY
		if((row1==row2)&&(column1==column2))
			checkMatrixEquality(matrix1,matrix2);
		else
			System.out.print("Matrices are of different sizes. Therefore, not equal.");
		
		//Matrix SUM
		if((row1==row2)&&(column1==column2)) {
			System.out.print("\nSum of matrix 1 and matrix2 :\n");
			printMatrix(getMatrixSum(matrix1,matrix2));
		}
		
		else
				System.out.print("\nMatrices are of different sizes. Therefore, cannot find sum.");

		//Matrix PRODUCT
		if(column1==row2) {
			System.out.print("\nProduct of matrix 1 and matrix2 :\n");
			printMatrix(getMatrixProduct(matrix1,matrix2));
		}
		else
			System.out.print("\nMatrices sizes need to be such that row of first = column of second matrix.");
		
		//Matrix TRANSPOSE
		System.out.print("\nTranspose of matrix 1 :\n");
		printMatrix(getTransposeMatrix(matrix1));
		
		System.out.print("\nTranspose of matrix 2 :\n");
		printMatrix(getTransposeMatrix(matrix2));
		
			
	}
}
