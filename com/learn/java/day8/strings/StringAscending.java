package com.learn.java.day8.strings;
import java.util.Scanner;

public class StringAscending {
	static long characters[]=new long [(int) (Math.pow(2,16)-1)];

	public static void takeLetterCount(String str) {
		long stringLength = str.length();
		int i=0;
		while(i<stringLength) {
			characters[str.charAt(i++)]++;		
		}
	}
	
	public static String sortString() {
		String sortedString=new String();
		int characterLength=characters.length;
		for(int i=0;i<characterLength; i++) {
			if(characters[i]!=0) {
				while((characters[i]--)>0) {
					sortedString+=(char)i;
				}
			}
		}
		return sortedString;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string : ");
		
		takeLetterCount(s.nextLine());

		System.out.println(sortString());
		
	}

}
