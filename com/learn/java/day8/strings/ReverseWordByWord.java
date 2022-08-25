package com.learn.java.day8.strings;
import java.util.Scanner;

public class ReverseWordByWord {
	static String reverseWord(String str,int startingPosition,int stoppingPosition) {
		String revString=new String();
		int i=stoppingPosition;
		while(i>=startingPosition)
				revString+=str.charAt(i--);
		return revString;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		int index=0;
		String newString=new String();
		int startingPosition=index;
		while(index<=str.length()) {
			if((index==str.length())||(str.charAt(index)==' ')){
				newString+=reverseWord(str,startingPosition,index-1)+" ";
				index++;
				startingPosition=index;
			}
			else
				index++;
		}
		System.out.print(newString);
	}

}
