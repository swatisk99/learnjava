package com.learn.java.day9.extra;

import java.util.Scanner;

class File{
	private static File file = null;
	private final String fileName;
	private final String filePath;
	File(String fName,String fPath){
		fileName = fName;
		filePath = fPath;
	}
	public static File createFile() {
		Scanner scan = new Scanner(System.in);
		//if(file==null) {
			//System.out.println("Enter filename : ");  
			String fName = setFileName();//new String(scan.nextLine());
			
			//System.out.println("Enter filepath : ");
			String fPath = setFilePath();// String(scan.nextLine());
			
			file = new File(fName,fPath);
			System.out.println("File created");
		//}
		/**else {
			System.out.println("File already exists. ");
		}
		**/
		return file;
	}
	public static String setFileName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter filename : ");
		String fName = new String(scan.nextLine());;
		if(file!=null) {
				file.displayFileDetails();
				System.out.println("Filename "+file.fileName+" cannot be changed!!!");
		}
		else {
			System.out.print(fName+" is created and stored in");
		}
		return fName;
	}
	
	private static String setFilePath() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter filepath : ");
		String fPath = new String(scan.nextLine());
		if(file!=null) {
			System.out.println("Filepath "+file.filePath+" cannot be changed!!!!");
		}
		else {
			System.out.println(fPath);
		}
		return fPath;
	}
	
	
	void displayFileDetails() {
		System.out.println(filePath+"/"+fileName);
	}
	
}
public class Files {
	
	public static void main(String[] args) {
		File file = File.createFile();
		File.setFileName();
		file.displayFileDetails();
	
		File file2 = File.createFile();
		File.setFileName();
		file2.displayFileDetails();
		file.displayFileDetails();
	}

}
