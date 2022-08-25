package com.learn.java.day8;
import java.util.Scanner;

public class IncrementalArray {
	public static long[] createIncrementalArray(int size) {
		int index=0;
		long array[]=new long [size], value;
		boolean isBigger;
		Scanner s=new Scanner(System.in);
		System.out.print("array["+index+"] -> ");
		array[index++]=s.nextLong();
		while(index<size)
		{	System.out.print("array["+index+"] -> ");
			value=s.nextLong();
			isBigger=true;
			if(value<array[index-1]){
					System.out.println("Number must be greater than "+array[index-1]);
					isBigger=false;
				}
			if(isBigger)
			{	array[index++]=value;
			}
		}
		return array;
	}
	public static void main(String[] args) {
		System.out.print("enter size of array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int index=0;
		System.out.println("enter "+size+" elements: ");
		index=0;
		long array[]=new long [size];
		array=createIncrementalArray(size);
		while(index<size)
		{	System.out.print(array[index++]+" ");
		}
	}

}
