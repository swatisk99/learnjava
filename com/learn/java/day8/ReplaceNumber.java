package com.learn.java.day8;
import java.util.Scanner;

public class ReplaceNumber {

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
		System.out.print("Element to be replaced : ");
		long element=s.nextLong();
		System.out.print("Replace with : ");
		long replace=s.nextLong();
		for(index=0;index<size;index++) {
			if(array[index]==element)
				array[index]=replace;
		}
		System.out.print("Array with replaced elements");
		for(index=0;index<size;index++)
			System.out.print(array[index]+" ");
	}

}
