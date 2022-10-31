package com.learn.java.ch12;
import java.util.Random;

public class OrdinalDemo {
	public static void main(String[] args) {
		Random random = new Random();
		//Randomly assign enum values to variables
		Grocery item = Grocery.values()[random.nextInt(Grocery.values().length)];
		DaysOfTheWeek day1 = DaysOfTheWeek.values()[random.nextInt(6)];
		DaysOfTheWeek day2 = DaysOfTheWeek.values()[random.nextInt(6)];
		System.out.println(day1+"\t"+day2+"\t"+item);
		//if same enum type, checks if ordinal are same
		System.out.println(day1==day2);
		System.out.println(day1.equals(day2));
		System.out.println(day1.equals(item));
		DaysOfTheWeek day3 = DaysOfTheWeek.MONDAY;
		DaysOfTheWeek day4 = DaysOfTheWeek.MONDAY;
		Grocery item2 = Grocery.SHAMPOO;
		//print enum names along with their ordinals i.e, order of listing
		System.out.println(day3+" "+day3.ordinal()+"\t"+day4+day4.ordinal()+"\t"+item2+" "+item2.ordinal());
		System.out.println(day3==day4);
		System.out.println(day3.equals(day4));
		System.out.println(day2.equals(item2));
	}
}
