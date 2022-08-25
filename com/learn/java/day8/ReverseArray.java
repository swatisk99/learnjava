package com.learn.java.day8;

public class ReverseArray {

	public static void main(String[] args) {
		int array[]= {1,2,3,5,7,8,10,14,17};
		int j;
		for(int i:array)
			System.out.print(i+" ");
		int swap,size=array.length;
		for(j=0;j<=(size/2);j++)
		{	swap=array[j];
			array[j]=array[size-j-1];
			array[size-j-1]=swap;
		}System.out.println("\nAfter reversing array");	
		for(int i:array)
			System.out.print(i+" ");
	}
	

}
