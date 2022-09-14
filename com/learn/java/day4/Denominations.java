package com.learn.java.day4;
import java.util.*;

import com.learn.java.day8.SortArray;


public class Denominations {
	static long[] getDistinctNotesArray(int distinctNotes) {
		Scanner sc=new Scanner(System.in);
		long[] notes = new long [distinctNotes];
		System.out.println("Enter the notes");
		for(int i=0;i<distinctNotes;i++) {
			notes[i]=sc.nextInt();
		}
		return SortArray.getDescendingOrder(notes);
	}
	
	/**
	 * if the denominations were fixed, use this function
	 * @param rupees
	 */
	static void getDenominations(int rupees) {
		int denominations,balance;
		denominations=rupees/2000;
		balance=rupees%2000;
		System.out.println("2000 X "+denominations+"\t= "+(2000*denominations));
		denominations=balance/500;
		balance=balance%500;
		System.out.println("500 X "+denominations+"\t= "+(500*denominations));
		denominations=balance/100;
		balance=balance%100;
		System.out.println("100 X "+denominations+"\t= "+(100*denominations));
		denominations=balance/50;
		balance=balance%50;
		System.out.println("50 X "+denominations+"\t= "+(50*denominations));
		denominations=balance/10;
		balance=balance%10;
		System.out.println("10 X "+denominations+"\t= "+(10*denominations));
		System.out.println("1 X "+balance+"\t= "+balance+"\n-------------\nTotal\t= "+rupees);
	}
	
	/**
	 * When the user defines the number of distinct notes
	 * @param rupees
	 * @param notes
	 */
	static void getDenominations(int rupees,long [] notes){
		HashMap<Long,Long> NumberOfNotes = new HashMap<>();
		int distinctNotes=notes.length;
		for(int i=0;i<distinctNotes;i++) {
			NumberOfNotes.put(notes[i], rupees/notes[i]);
			rupees-=(notes[i]*(rupees/notes[i]));
		}
		long hashmapSize = NumberOfNotes.size();
		long denomination;
		for(Long i : NumberOfNotes.keySet()) {
			denomination = NumberOfNotes.get(i);
			System.out.println(i+"\tX\t"+denomination+"\t= "+(i*denomination));
		}
		System.out.println(NumberOfNotes);
	}
	
	
	public static void main(String[] args) {
		//rupees to denominations
		Scanner sc=new Scanner(System.in);
		System.out.print("Rupees\t: ");
		int rupees;
		rupees=sc.nextInt();
		System.out.println("Finding rupees when notes are fixed : ");
		getDenominations(rupees);
		
		System.out.println("\nWhen notes are given by user : ");
		System.out.print("Enter number of distinct notes : ");
		int distinctNotes = sc.nextInt();
		getDenominations(rupees,getDistinctNotesArray(distinctNotes));
		
	
/**		//denominations to rupees
		int denominations;
		System.out.println("\n\nEnter the denominations");
		System.out.print("2000 = ");
		denominations=sc.nextInt();
		rupees=denominations*2000;
		System.out.print("500 = ");
		denominations=sc.nextInt();
		rupees+=denominations*500;
		System.out.print("200 = ");
		denominations=sc.nextInt();
		rupees+=denominations*200;
		System.out.print("100 = ");
		denominations=sc.nextInt();
		rupees+=denominations*100;
		System.out.print("50 = ");
		denominations=sc.nextInt();
		rupees+=denominations*50;
		System.out.print("Rs. "+rupees);	
**/
	}

}
