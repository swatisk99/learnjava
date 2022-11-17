package com.learn.java.collections;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
class StudentMarks implements Comparable<StudentMarks>,Serializable{
	String rollNo; 
	Float phyMark, chemMark, mathMark,totalMarks;
	StudentMarks(String rollNo, float phyMark, float chemMark, float mathMark){
		this.rollNo = rollNo;
		this.phyMark = phyMark;
		this.chemMark = chemMark;
		this.mathMark = mathMark;
		totalMarks = phyMark + chemMark + mathMark;
	}
	public String toString() {
		return "\nRoll Number : "+rollNo+"\nTotalMarks : "+totalMarks+ "\nPhy : "+phyMark+"\tChem : "+chemMark+"\tMath : "+mathMark;
	}	
	@Override
	public int compareTo(StudentMarks sMarks) {
		//TODO:
		if(this.rollNo.equalsIgnoreCase(sMarks.rollNo)) {
			return 0;
		}
		if(this.totalMarks.compareTo(sMarks.totalMarks) == 0) {
			if(this.phyMark.compareTo(sMarks.phyMark) == 0) {
				if(this.chemMark.compareTo(sMarks.chemMark) == 0) {
					if(this.mathMark.compareTo(sMarks.mathMark) == 0) {
						return 1;
					}
					return this.mathMark.compareTo(sMarks.mathMark) * -1;
				}
				return this.chemMark.compareTo(sMarks.chemMark) * -1;
			}
			return this.phyMark.compareTo(sMarks.phyMark) * -1;
		}
		return this.totalMarks.compareTo(sMarks.totalMarks) * -1;
	}

	public int compareToOld(StudentMarks sMarks) {
		if(this.rollNo.equalsIgnoreCase(sMarks.rollNo)) {
			return 0;
		}
		if(this.totalMarks==sMarks.totalMarks) {
			if(this.phyMark==sMarks.phyMark) {
				if(this.chemMark==sMarks.chemMark) {
					if(this.mathMark==sMarks.mathMark) {
						return 1;
					}
					if(this.mathMark>sMarks.mathMark) {
						return -1;
					}
					return 1;
				}
				if(this.chemMark>sMarks.chemMark) {
					return -1;
				}
				return 1;
			}
			if(this.phyMark>sMarks.phyMark) {
				return -1;
			}
			return 1;
		}
		if(this.totalMarks>sMarks.totalMarks) {
			return -1;
		}
		return 1;
	}
}
public class RankList {
	public static Scanner scanner = new Scanner(System.in);
	public static StudentMarks enterStudentMarks(){
		String rollNo; 
		float phyMark, chemMark, mathMark;
		System.out.print("Name : ");
		rollNo = scanner.nextLine();
		System.out.print("Marks (PCM) : ");
		phyMark = scanner.nextInt();
		chemMark = scanner.nextInt();
		mathMark = scanner.nextInt();	scanner.nextLine();
		return new StudentMarks(rollNo,phyMark,chemMark,mathMark);
	}
	public static void main(String[] args) {
		TreeSet<StudentMarks> rankList = new TreeSet<>();
		System.out.print("Enter class strength : ");
		int classStrength = scanner.nextInt();			scanner.nextLine();
		for(int i = 1;i <= classStrength;i++) {
			rankList.add(enterStudentMarks());
		}
		try{
			FileOutputStream fout = new FileOutputStream("StudentDB1.txt");
			ObjectOutputStream o = new ObjectOutputStream(fout);
			o.writeObject(rankList);
			o.flush();
	
		}
        catch (Exception e) {
        	System.out.print(e.toString());
        }
		System.out.println("\n\nRank List :\n"+rankList);
//		System.out.println(rankList.floor(new StudentMarks("", 9, 9, 9)));		
		scanner.close();
		
	}
}