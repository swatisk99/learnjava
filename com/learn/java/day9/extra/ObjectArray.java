package com.learn.java.day9.extra;

import java.io.IOException;
import java.util.Scanner;

class StudentDetails {
	StringBuilder name;
	long id;
	char gender;
	StudentDetails(StringBuilder name,long id,char gender){
		this.name = name;
		this.id = id;
		this.gender = gender;
	}
	boolean equals(StringBuilder name1, StringBuilder name2){
        if(name1 == name2)
            return true;
        if(name1 == null || name2 == null)
            return false;
        boolean isEqual = true;
        if(name1.length() == name2.length()){
        	for(int i = 0 ; i < name1.length(); i++){
            	if(name1.charAt(i) != name2.charAt(i)){
                	isEqual = false;
                	break;
                }
            }
        }
        else{
            isEqual = false;
        }
        return isEqual;
	}
}

public class ObjectArray {
	
	public static void main(String[] args){
		System.out.println("Enter number of students : ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		StudentDetails[] students = new StudentDetails[size];
		for(int i=0;i<size;i++) {
			scan.nextLine();
			System.out.println("Name : ");
			StringBuilder name = new StringBuilder(scan.nextLine());
			System.out.println("ID : ");
			long id = scan.nextLong();
			System.out.println("Gender (M/F/O) : ");
			char gender = scan.next().charAt(0);
			students[i] = new  StudentDetails(name,id,gender);
		}scan.nextLine();
		System.out.println("Enter name of student to obtain data");
		StringBuilder studentName = new StringBuilder(scan.nextLine());
		for(int i=0;i<size;i++) {
			if(students[i].equals(students[i].name,studentName)) {
				System.out.println("Name : "+students[i].name);
				System.out.println("ID : "+students[i].id);
				System.out.println("Gender (M/F/O) : "+students[i].gender);
			}
			else {
				System.out.println("No Such Record exists");
			}
		}

	}
}
