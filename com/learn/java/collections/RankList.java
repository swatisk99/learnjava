package com.learn.java.collections;
import java.util.*;
class StudentMarks implements Comparable<StudentMarks>{
	String name; 
	float phyMark, chemMark, mathMark,totalMarks;
	StudentMarks(String name, float phyMark, float chemMark, float mathMark){
		this.name = name;
		this.phyMark = phyMark;
		this.chemMark = chemMark;
		this.mathMark = mathMark;
		totalMarks = phyMark + chemMark + mathMark;
	}
	public String toString() {
		return "\nName : "+name+"\nTotalMarks : "+totalMarks+ "\nPhy : "+phyMark+"\tChem : "+chemMark+"\tMath : "+mathMark;
	}	
	@Override
	public int compareTo(StudentMarks sMarks) {
		if(this.name.equalsIgnoreCase(sMarks.name)) {
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
		String name; 
		float phyMark, chemMark, mathMark;
		System.out.println("Name : ");
		name = scanner.nextLine();
		System.out.println("Marks (PCM) : ");
		phyMark = scanner.nextInt();
		chemMark = scanner.nextInt();
		mathMark = scanner.nextInt();	scanner.nextLine();
		return new StudentMarks(name,phyMark,chemMark,mathMark);
	}
	public static void main(String[] args) {
		TreeSet<StudentMarks> rankList = new TreeSet<>();
		System.out.println("Enter class strength : ");
		int classStrength = scanner.nextInt();			scanner.nextLine();
		for(int i = 1;i <= classStrength;i++) {
			rankList.add(enterStudentMarks());
		}
		System.out.println("\n\n"+rankList);
		System.out.println(rankList.floor(new StudentMarks("", 9, 9, 9)));		
		scanner.close();
	}
}