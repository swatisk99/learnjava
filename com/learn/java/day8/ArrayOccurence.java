package com.learn.java.day8;
import java.util.Scanner;

public class ArrayOccurence {

	public static void main(String[] args) {
		System.out.print("enter size of array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int index=0,i=0;
		System.out.print("enter "+size+" elements: ");
		long a[]=new long [size];
		while(index<size)
		{	a[index++]=s.nextLong();
		}System.out.print("element to be found : ");
		long element=s.nextLong();
		int occurence=0;
		for(index=0;index<size;index++)
		{	if(a[index]==element)
				occurence++;
		}
		if(occurence==0)
			System.out.print("Element not found!");
		else {
			System.out.print(element+" is found "+occurence+" times in positions : \t");
			for(index=0;index<size;index++)
			{	if(a[index]==element)
					System.out.print((index+1)+" ");
			}
		}
		
	}
}
