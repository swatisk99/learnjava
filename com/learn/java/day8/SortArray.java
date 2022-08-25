package com.learn.java.day8;
import java.util.Scanner;

public class SortArray {
	public static long[] getAscendingOrder(long array[]) {
		int size=array.length,position,index;
		long swapElement;
		for(int iterations=0;iterations<size;iterations++) {
			swapElement=array[iterations];
			position=iterations;
			for(index=iterations;index<size;index++)
			{	if(swapElement>array[index]) {
					swapElement=array[index];
					position=index;
				}
			}
			if(position!=iterations) {
				array[position]=array[iterations];
				array[iterations]=swapElement;
			}
		}return array;
	}
	
	public static long[] getDescendingOrder(long array[]) {
		int size=array.length,position,index;
		long swapElement;
		for(int iterations=0;iterations<size;iterations++) {
			swapElement=array[iterations];
			position=iterations;
			for(index=iterations;index<size;index++)
			{	if(swapElement<array[index]) {
					swapElement=array[index];
					position=index;
				}
			}if(position!=iterations) {
				array[position]=array[iterations];
				array[iterations]=swapElement;
			}
		}return array;
	}
	
	public static void main(String[] args) {
		System.out.print("enter size of array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int index=0;
		System.out.print("enter "+size+" elements: ");
		long array[]=new long [size];
		while(index<size)
		{	array[index++]=s.nextLong();
		}
		System.out.print("Sort Options :\n1.Ascending order\t2. Descending order\nEnter choice : ");
		int choice=s.nextInt();
		switch (choice) {
			case 1:	
				getAscendingOrder(array);
				break;
			case 2:
				getDescendingOrder(array);
				break;
			default:	System.out.print("Wrong choice.Try again");
						break ;
			}
		
	index=0;
	while(index<size)
	{	System.out.print(array[index++]+" ");
	}
	System.out.print("\n"+ Runtime.getRuntime().totalMemory()+" "+Runtime.getRuntime().maxMemory());
	
	}
}