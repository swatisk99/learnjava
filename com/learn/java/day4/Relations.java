package com.learn.java.day4;
import java.util.*;
public class Relations {

	public static void main(String[] args) {
		double value_1,value_2,value_3,big,small;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		value_1=scan.nextDouble();
		value_2=scan.nextDouble();
		value_3=scan.nextDouble();
		big=value_1>value_2?value_1:value_2;
		big=big>value_3?big:value_3;
		small=value_1<value_2?value_1:value_2;
		small=small<value_3?small:value_3;
		/*	if(value_1>value_2){
				if(value_1>value_3)
				{	big=value_1;
					if(value_2>value_3)
						small=value_3;
					else small=value_2;
				}
				else
				{	big=value_3;
					small=value_2;	}
			}
			else {
				if(value_2>value_3)
				{	big=value_2;
					if(value_1>value_3)
						small=value_3;
					else	small=value_1;
				}
				else
				{	big=value_3;
					small=value_1;	}
			} 
		 */
		System.out.println("Biggest\t"+big+"\nSmallest\t"+small);
	}
}