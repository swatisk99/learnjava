package com.learn.java.day8.strings;
import java.util.Scanner;

public class StringOperations {
	static void getTitleCase(String str) {
		int i=0;
		String newString=new String();
		while(i<str.length())
		{	if((i==0)||(str.charAt(i-1)==' ')) {
				if((str.charAt(i)>=97)&&(str.charAt(i)<=122))
					newString=newString+(char)(str.charAt(i)-32);
				else
					newString=newString+str.charAt(i);
			}
			else {
				if((str.charAt(i)<=90)&&(str.charAt(i)>=65))
					newString=newString+(char)(str.charAt(i)+32);
				else
					newString=newString+str.charAt(i);
			}i++;
		}
		System.out.print(newString);
	}
	
	public static StringBuilder getUpperCase(StringBuilder name1) {
		int i=0;
		StringBuilder strb = new StringBuilder();
		while(i<name1.length())
		{	if((name1.charAt(i)>=97)&&(name1.charAt(i)<=122))
					strb.append((char)(name1.charAt(i)-32));
			else
					strb.append(name1.charAt(i));
			i++;
		}
		return strb;
	}
	
	static void getLowerCase(String str) {
		int i=0;
		String newString=new String();
		while(i<str.length())
		{	if((str.charAt(i)>=65)&&(str.charAt(i)<=90))
					newString=newString+(char)(str.charAt(i)+32);
			else
					newString=newString+str.charAt(i);
		i++;
		}
		System.out.print(newString);
	}
	
	static void getSentenceCase(String str) {
		int i=0;
		String newString=new String();
		while(i<str.length())
		{	if((i==0)||(str.charAt(i-1)=='.')){
				if((str.charAt(i)>=97)&&(str.charAt(i)<=122))
					newString=newString+(char)(str.charAt(i)-32);
				else
					newString=newString+str.charAt(i);
			}
			else {
				if((str.charAt(i)>=65)&&(str.charAt(i)<=90))
					newString=newString+(char)(str.charAt(i)+32);
				else
					newString=newString+str.charAt(i);
			}
			i++;
		}
		System.out.print(newString);
}
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter string");
		String str=s.nextLine();
		StringBuilder strb = new StringBuilder(str);
		System.out.print("Convert to :\n1.Title Case\t2.UPPER CASE\t3.lower case\t4.Sentence case\nEnter choice : ");
		int i=0,choice=s.nextInt();
		String result=new String();
		switch (choice){
			case 1:
				getTitleCase(str);
				break;
			case 2:
				System.out.println(getUpperCase(strb));
				break;
			case 3:
				getLowerCase(str);
				break;
			case 4:
				getSentenceCase(str);
				break;
			default:
				System.out.print("wrong choice");
				
		
		}
	}
}
