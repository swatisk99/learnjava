package com.learn.java.day8;
import java.util.Scanner;

public class ReplaceChar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		int i=0;
		System.out.print("Enter character to be replaced : ");
		char character=s.next().charAt(0);
		System.out.print("Replace with : ");
		char replace=s.next().charAt(0);
		boolean charPresent=true;
		String newString=new String();
		while(i<str.length())
		{	if(str.charAt(i)==character) {
				newString+=replace;
				charPresent=true;
				i++;
				break;
			}
			else {
				charPresent=false;
				newString+=str.charAt(i++);
			}				
		}
		if(!charPresent) {
			System.out.print(character+" is not present in string");
			System.out.print(newString);
		
		}
		
		else {
			while(i<str.length())
				newString+=str.charAt(i++);
			System.out.print(newString);
		}
	}	

}
