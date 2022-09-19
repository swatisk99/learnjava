package com.learn.java.day9.extra;

import java.util.Scanner;

class File{
	private static File file = null;
	final StringBuilder fileName;
	final StringBuilder filePath;
	private StringBuilder fileContent;
	private File(StringBuilder fName,StringBuilder fPath){
		fileName = fName;
		filePath = fPath;
	}
	public static File createFile() {
		Scanner scan = new Scanner(System.in);
		if(file==null) {
			//System.out.println("Enter filename : ");  
			StringBuilder fName = setFileName();//new StringBuilder(scan.nextLine());
			
			//System.out.println("Enter filepath : ");
			StringBuilder fPath = setFilePath();// StringBuilder(scan.nextLine());
			
			file = new File(fName,fPath);
			System.out.println("File created");
		}
		else {
			System.out.println("File already exists. ");
		}
		return file;
	}
	public static StringBuilder setFileName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter filename : ");
		StringBuilder fName = new StringBuilder(scan.nextLine());;
		if(file!=null) {
				System.out.println("Filename already set. Cannot change fileName!");
		}
		return fName;
	}
	
	private static StringBuilder setFilePath() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter filepath : ");
		StringBuilder fPath = new StringBuilder(scan.nextLine());
		if(file!=null) {
			System.out.println("Filepath already set. Cannot move!");
		}
		return fPath;
	}
	
	private void readFile() {
		if (fileContent == null) {
			System.out.println("File empty");
		}
		else {
			System.out.println(fileContent);
		}
	}
	
	private File writeToFile() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter content : ");
		if (fileContent==null) {
			fileContent= new StringBuilder(scan.nextLine());
		}
		else {
			
			fileContent.append(scan.nextLine());
		}
		return file;
	}
	public void openFile() {
		byte cont;
		System.out.println("Enter filename : ");
		Scanner scan = new Scanner(System.in);
		StringBuilder fName = new StringBuilder(scan.nextLine());
		if(fileName.toString().equals(fName.toString())) {
			System.out.println("Opened file : "+filePath+"/"+fileName);
			do{
				System.out.println("1.Read?\t2.Write?");
				switch (scan.nextInt())
				{	case 1:		readFile();
								break;
					case 2: 	writeToFile();
								break;
					default:	System.out.println("Invalid option");
				}
				System.out.println("To Continue, enter 1)");
				cont = scan.nextByte();
			}while(cont == 1);
		}
		else {
			System.out.println("No such file exists");
		}
		
	}
	
	void displayFileDetails() {
		System.out.println(filePath+"/"+fileName+" :\n"+fileContent);
	}
	
}
public class Files {
	
	public static void main(String[] args) {
		File file = File.createFile();
		file.openFile();
		File.setFileName();
		file.displayFileDetails();
	}

}
