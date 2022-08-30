package com.learn.java.day8.strings;

import java.util.Scanner;

public class FindString {
	public static void findMatch(String str, String substring, int i) {
		int j=0,substringLength=substring.length();
		while(j<substringLength) {
			if(str.charAt(i)==substring.charAt(j)) {
				j++;i++;
			}
			else
				break;
		}
		if(j==substringLength)
			System.out.println(substring+" present in \""+str+"\" from "+(i-substringLength+1)+"th postion.");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter string");
		String str=scan.nextLine();
		System.out.print("Enter substring to find");
		String substring = scan.nextLine();
		int i=0,stringLength=str.length(),substringLength=substring.length();
		
		while(i<=(stringLength-substringLength)) {
			if(str.charAt(i)==substring.charAt(0)) {
				findMatch(str,substring,i);
			}
			i++;
		}
		if(i>(stringLength-substringLength+1))
			System.out.print("Subtring not found");
		
			
	}

}
