package com.learn.java.day6;
import java.util.Scanner;

public class BillingCriteria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter units consumed");
		float unit = sc.nextFloat(), bill;
		if (unit <= 100)
			bill = 0;
		if (unit <= 300)
			bill = (unit - 100) * 2.5f;
		else if (unit <= 500)
			bill = 500 + (unit - 300) * 3;
		else if (unit <= 1000)
			bill = 1100 + (unit - 500) * 5;
		else
			bill = 3600 + (unit - 1000) * 7;
		System.out.print("Bill amount\t: Rs" + bill);
	}

}
