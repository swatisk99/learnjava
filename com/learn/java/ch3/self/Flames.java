package com.learn.java.ch3.self;

import java.util.Scanner;

public class Flames {
	public static String removeLetter(String name,int i) {
		int k=0;
		String result="";
		while(k<i) {
			result+=name.charAt(k++);
		}
		while(k<(name.length()-1)) {
			result+=name.charAt(++k);
		}
		return result;
	}
	
	public static char findFlames(int value) {
		String flames="FLAMES";
		int position,startingPosition=0;
		while(flames.length()>1) {
			position=(startingPosition+value-1)%flames.length();
			flames=removeLetter(flames,position);
			startingPosition=position%flames.length();
			System.out.println(flames);
			
		}
		return flames.charAt(0);
	}
	
	public static void main(String[] args) {
		String name1,name2,resultName1="",resultName2="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		name1=scan.next();
		System.out.println("Enter second name");
		name2=scan.next();
		int j,i=0;
		while(i<name1.length()) {
			j=0;
			while(j<name2.length()){
				if(name2.charAt(j)==name1.charAt(i)) 
				{	name1 = removeLetter(name1,i);
					i--;
					name2 = removeLetter(name2,j);
					break;
				}
				else
					j++;
			}i++;
		}
		int value=name1.length()+name2.length();
		System.out.println(name1+""+name2+" -> "+value+" letters");
		char relation=findFlames(value);
		switch (relation) {
			case 'F':	System.out.println("Friends");
						break;
			case 'L':	System.out.println("L");
						break;
			case 'A':	System.out.println("Acquaintance");
						break;
			case 'M':	System.out.println("M");
						break;
			case 'E':	System.out.println("Enemies");
						break;
			case 'S':	System.out.println("Siblings");
						break;
					
		
			
		}
	}

}
