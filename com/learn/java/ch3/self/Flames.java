package com.learn.java.ch3.self;

import java.util.Scanner;
import com.learn.java.day8.strings.StringOperations;


public class Flames {
	
	/**
	 * Removes spaces within name
	 * @param name
	 * @return nameWOSpace contains string without space.
	 */
		public static String removeSpace(String name) {
			int lengthOfName=name.length();
			int i=0,j=1,startPosition=0;
			int countSpaces=0;
			String nameWOSpace="";
			while(i<lengthOfName){
				// Adds substring before ' ' to new string
				if(name.charAt(i)==' ') {
					nameWOSpace += name.substring(startPosition,i);
					startPosition=i+1;
				}		
				i++;	
			}
			nameWOSpace += name.substring(startPosition,lengthOfName);
			System.out.println(nameWOSpace);

			return nameWOSpace;
		}
		
		/**
		 * To check if name contains only letters from the English alphabet
		 * @param name
		 * @return
		 */
		public static boolean checkNameValidity(String name) {
			int lengthOfName=name.length(),i=0;
			while(i<lengthOfName) {
				if(!checkIfLetter(name.charAt(i++))) {
					return false;
				}
			}
			return true;
		}

		/**
		 * Checks whether letter belongs to English alphabet
		 * @param letter
		 * @return
		 */
		public static boolean checkIfLetter(char letter) {
			if(((letter>=65)&&(letter<=90))||((letter>=97)&&(letter<=122))) {
				return true;
			}
			else {
				return false;
			}
		}
		
		/**
		 * Obtain length of unique letters in both names.
		 * @param name1
		 * @param name2
		 * @return sum of length of unique letters
		 */
		public static int getUniqueCharLen(String name1,String name2) {
		int j,i=0;
		int lengthOfName1=name1.length();
		int lengthOfName2=name2.length();
		name1 = StringOperations.getUpperCase(name1);
		name2 = StringOperations.getUpperCase(name2);
		while(i<lengthOfName1) {
			j=0;
			while(j<lengthOfName2){
				if(name2.charAt(j)==name1.charAt(i)) 
				{	name1 = removeLetter(name1,i);
					i--;
					name2 = removeLetter(name2,j);
					System.out.println(name1+" "+name2);
					break;
				}
				else
					j++;
				lengthOfName2=name2.length();
			}
			i++;lengthOfName1=name1.length();
		}
		return name1.length()+name2.length();
	}

		/**
		 * remove letterat position i from a string
		 * @param name
		 * @param i : stores the position of letter to be removed
		 * @return result stores the new string
		 */
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
	
	/**
	 * For the given count, remove letters from "FLAMES" till only one remain
	 * @param uniqueCharLength : unique letters in both names
	 * @return last remaining letter from 'FLAMES'
	 */
	public static char findFlames(int uniqueCharLength) {
		String flames="FLAMES";
		int position,startingPosition=0;
		System.out.print("FLAMES");
		while(flames.length()>1) {
			position=(startingPosition + uniqueCharLength - 1)%flames.length();
			flames = removeLetter(flames,position);
			startingPosition=position%flames.length();
			System.out.print(" -> "+flames);
			
		}
		return flames.charAt(0);
	}
	
	/**
	 * Get the relation corresponding to obtained letter 
	 * @param uniqueCharLength
	 * @return
	 */
	public static String getRelation(int uniqueCharLength){
		if(uniqueCharLength!=0) {
			char relation=findFlames(uniqueCharLength);
			switch (relation) {
				case 'F':	return "Friends";
				case 'L':	return "Lovers";
				case 'A':	return "Acquaintance";
				case 'M':	return "Married";
				case 'E':	return "Enemies";
				case 'S':	return "Siblings";			
			}
			return null;
		}
		else {
			return "Friends";
		}
	}
	
	/**
	 * prints the relation
	 * @param relation
	 */
	public static void printRelation(String relation) {
		System.out.print("\n"+relation);
	}
	public static void main(String[] args) {
		/** Read two names**/
		String name1,name2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		name1=scan.nextLine();
		System.out.println("Enter second name");
		name2=scan.nextLine();
		
												//long start=System.nanoTime();
		/** Removing spaces from the name **/
		name1 = removeSpace(name1);
		name2 = removeSpace(name2);
		
		/**	Check whether names are valid **/
		if((!checkNameValidity(name1))||(!checkNameValidity(name2))){
				System.out.println("Invalid name!!!\nName should only contain letters");
		}
		else{
			/**	Check whether names are same **/
			if(name1.equals(name2)) {
				System.out.println("Please enter two different names between 2 and 100 characters long!");
			}
			else {
				/**	Get length of unique letters **/
				int uniqueCharLength = getUniqueCharLen(name1,name2);
				System.out.println(name1+" and "+name2+" have "+uniqueCharLength+" unique letters");
				printRelation(getRelation(uniqueCharLength));
			}
		}
		/**	long end=System.nanoTime();
			System.out.println(end-start);
			Runtime runtime=Runtime.getRuntime();
			System.out.println(runtime.totalMemory()-runtime.freeMemory());
		**/
		
	}

}
