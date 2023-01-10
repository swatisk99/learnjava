package com.test;

import java.util.Scanner;
/**
 * Takes uri and uri pattern from user and prints key value pairs
 * @author swati-15154
 *
 */
public class URIPatternChecker {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter the URI Expression : ");
			String uriPattern = scanner.next();
			byte continueVar=1;
			do {
				try{
					System.out.println("Enter the Actual URI : ");
					String uri = scanner.next();
					scanner.nextLine();
					System.out.println(URIUtils.extractURLKeys(uri,uriPattern));	
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Continue ? Enter 1");
				continueVar = scanner.nextByte();
			}while(continueVar==1);
			//System.out.println("10".matches("[0-9]+"));
			//System.out.println(URLUtils.extractURLValues(url));
		}
		
	}

}
