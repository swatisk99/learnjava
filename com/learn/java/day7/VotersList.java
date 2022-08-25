package com.learn.java.day7;
import java.util.Scanner;

public class VotersList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int eligible=0,elmale=0,elfemale=0,nonelmale=0,nonelfemale=0;
		byte age;
		String gender,name;
		char cont='y';
		while(cont=='y') { 
			System.out.print("Name \t:");
			name=sc.nextLine();
			System.out.print("Age\t:");
			age=sc.nextByte();
			System.out.print("Gender(M/F)\t:");
			gender=sc.next();
			if(age>=18)
			{	if(gender.equals("M")||gender.equals("m"))
				{	System.out.print("Mr."+name+" is eligible to vote");
					elmale++;
				}
				else
				{	System.out.print("Ms."+name+" is eligible to vote");
					elfemale++;
				}				eligible++;
			}
			else {
				if(gender.equals("M")||gender.equals("m"))
				{	System.out.print("Mr."+name+" is not eligible to vote");
					nonelmale++;
				}
				else
				{	System.out.print("Ms."+name+" is not eligible to vote");
					nonelfemale++;
				}
			}
			System.out.print("\nContinue?(y/n)");
			cont=sc.next().charAt(0);
			sc.nextLine();
		}
		System.out.print("Number of candidates visited\t: "+(nonelmale+nonelfemale+elmale+elfemale)+"\nMale\t: "+(nonelmale+elmale)+"Female\t: "+(nonelfemale+elfemale)+"\nOverall eligible\t: "+eligible+"\nMale\t: "+elmale+"Female\t: "+elfemale);
	}

}
