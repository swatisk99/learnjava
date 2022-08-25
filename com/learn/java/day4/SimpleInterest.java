package com.learn.java.day4;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Principal amount\t");
		double p=scan.nextDouble();
		System.out.print("Rate of Interest\t");
		double r=scan.nextDouble();
		System.out.print("Number of days after receiving loan(From current date)\t");
		double t=scan.nextDouble();
		double si=p*r/100*t/365;
		double net=p+si;
		System.out.print("Simple interest\t: "+si+"\nNet payable amount\t: Rs"+net);
	
	}

}
