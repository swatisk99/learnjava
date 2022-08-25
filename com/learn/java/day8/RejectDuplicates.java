package com.learn.java.day8;
import java.util.Scanner;

public class RejectDuplicates {

	public static void main(String[] args) {
		System.out.print("enter size of array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int index=0,i;
		long value;
		boolean isDuplicate;
		System.out.println("enter "+size+" elements: ");
		long array[]=new long [size];
		System.out.print("array["+index+"] -> ");
		array[index++]=s.nextLong();
		while(index<size)
		{	System.out.print("array["+index+"] -> ");
			value=s.nextLong();
			isDuplicate=false;
			for(i=0;i<index;i++) {
				if(array[i]==value){
					System.out.println("Duplicate not allowed. Please enter another number");
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate)
			{	array[index++]=value;
			}
		}index=0;
		while(index<size)
		{	System.out.print(array[index++]+" ");
		}
	}

}
