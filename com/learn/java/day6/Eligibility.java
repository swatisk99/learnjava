package com.learn.java.day6;
import java.util.Scanner;

public class Eligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mark1, mark2, mark3, mark4, mark5, total, maxMarks;
		System.out.println("enter marks of 5 subject");
		mark1 = sc.nextInt();
		mark2 = sc.nextInt();
		mark3 = sc.nextInt();
		mark4 = sc.nextInt();
		mark5 = sc.nextInt();
		System.out.println("Max marks : ");
		maxMarks = sc.nextInt();
		total = mark1 + mark2 + mark3 + mark4 + mark5;
		if (total >= (maxMarks / 2))
			System.out.println("Passed to next grade.");
		else
			System.out.println("Ineligible for next grade.");

	}

}
