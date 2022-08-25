package com.learn.java.day8.strings;
import java.util.Scanner;

public class CountInString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		int i,characters,vowels,words,numbers,specialCharacters;
		i=characters=vowels=words=numbers=specialCharacters=0;
		int strlen=str.length();
		while(i<strlen) {
			if(((str.charAt(i)>=65)&&(str.charAt(i)<=90))||((str.charAt(i)>=97)&&(str.charAt(i)<=122)))
			{	while(((str.charAt(i)>=65)&&(str.charAt(i)<=90))||((str.charAt(i)>=97)&&(str.charAt(i)<=122))) {
					characters++;
					if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u')||(str.charAt(i)=='A')||(str.charAt(i)=='E')||(str.charAt(i)=='I')||(str.charAt(i)=='O')||(str.charAt(i)=='U'))
						vowels++;
					i++;
				}
				words++;
			}
			else if((str.charAt(i)>=48)&&(str.charAt(i)<=57))
			{	while((str.charAt(i)>=48)&&(str.charAt(i)<=57))
				{	i++;
				}
				numbers++;
			}
			else
			{
				specialCharacters++;i++;
			}
		}
		System.out.print("\nCharacters : "+characters+"\nWords : "+words+"\nVowels : "+vowels+"\nNumbers : "+numbers+"\nSpecial characters : "+specialCharacters);
	}
}
