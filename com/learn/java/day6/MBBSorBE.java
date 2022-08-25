package com.learn.java.day6;
import java.util.Scanner;

public class MBBSorBE {

	public static void main(String[] args) {
		System.out.print("Cutoff for MBBS and Engg respectively(out of 100)\t: ");
		double mbbsCutoff, enggCutoff;
		Scanner scan = new Scanner(System.in);
		mbbsCutoff = scan.nextDouble();
		enggCutoff = scan.nextDouble();
		System.out.print("Enter marks\t:");
		double marks = scan.nextDouble();
		if ((marks >= mbbsCutoff) && (marks >= enggCutoff))
			System.out.println("Eligible for both");
		else if (marks >= enggCutoff)
			System.out.println("Eligible for BE");
		else
			System.out.println("Ineligible for both");

	}

}
