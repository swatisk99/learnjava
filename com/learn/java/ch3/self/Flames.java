package com.learn.java.ch3.self;

import java.util.Scanner;
import com.learn.java.day8.strings.StringOperations;


public class Flames {
	/**
	 * checks if name only contains space
	 * @param name
	 * @return
	 */
	static StringBuilder flames=new StringBuilder("FLAMES");
	public static boolean checkIfEmpty(StringBuilder name) {
		int lengthOfName=name.length();
		int i=0;
		while(i<lengthOfName){
			// Adds substring before ' ' to new string
			if(name.charAt(i++)!=' ') {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Removes spaces within name
	 * @param name
	 * @return name now contains string without space.
	 */
		public static StringBuilder removeSpace(StringBuilder name) {
			int lengthOfName=name.length();
			int i=0;
			while(i<lengthOfName){
				if(name.charAt(i)==' ') {
					name = name.delete(i,i+1);
				}		
				i++;	
			}
			return name;
		}
		
		/**
		 * To check if name contains only letters from the English alphabet
		 * @param name
		 * @return
		 */
		public static boolean checkNameValidity(StringBuilder name) {
			int lengthOfName=name.length(),i=0;
			while(i<lengthOfName) {
				if(!checkIfLetter(name.charAt(i))&&(name.charAt(i)!=' ')) {
					return false;
				}i++;
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
		public static int getUniqueCharLen(StringBuilder name1,StringBuilder name2) {
		int j,i=0;
		int lengthOfName1=name1.length();
		int lengthOfName2=name2.length();
		name1 = StringOperations.getUpperCase(name1);
		name2 = StringOperations.getUpperCase(name2);
		while(i<lengthOfName1) {
			j=0;
			while(j<lengthOfName2){
				if(name2.charAt(j)==name1.charAt(i)) 
				{	name1.delete(i, i+1);
					i--;
					name2.delete(j, j+1);
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
	 * For the given count, remove letters from "FLAMES" till only one remain
	 * @param uniqueCharLength : unique letters in both names
	 * @return last remaining letter from 'FLAMES'
	 */
	public static char findFlames(int uniqueCharLength) {
		
		int position,startingPosition=0;
		System.out.print("FLAMES");
		while(flames.length()>1) {
			position=(startingPosition + uniqueCharLength - 1)%flames.length();
			flames = flames.delete(position,position+1);
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
				case 'F':	return "Friendship";
				case 'L':	return "Love";
				case 'A':	return "Affection";
				case 'M':	return "Marriage";
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
		StringBuilder name1,name2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		name1 = new StringBuilder(scan.nextLine());
		System.out.println("Enter second name");
		name2 = new StringBuilder(scan.nextLine());
		
												//long start=System.nanoTime();
		
		/**	Check whether names are valid **/
		if((!checkNameValidity(name1))||(!checkNameValidity(name2))){
			System.out.println("Invalid name!!!\nName should only contain letters");
		}
		else if(!checkIfEmpty(name1)||(!checkIfEmpty(name2))) {
			System.out.println("Enter 2 names!!!");			
		}
		else{
			/**	Check whether names are same **/
			if(name1.equals(name2)) {
				System.out.println("Please enter two different names between 2 characters long!");
			}
			else {
				/** Removing spaces from the name **/
				name1 = removeSpace(name1);
				name2 = removeSpace(name2);
				
				
				if((name1.length()==1)||(name2.length()==1)) {
					System.out.println("Names should contain atleast 2 letters each");
				}
				
				else {
					/**	Get length of unique letters **/
					int uniqueCharLength = getUniqueCharLen(name1,name2);
					System.out.println(name1+" and "+name2+" have "+uniqueCharLength+" unique letters");
					printRelation(getRelation(uniqueCharLength));
				}
			}
		}
		/**	long end=System.nanoTime();
			System.out.println(end-start);
			Runtime runtime=Runtime.getRuntime();
			System.out.println(runtime.totalMemory()-runtime.freeMemory());
		**/	
	}
}