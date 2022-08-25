package com.learn.java.ch3;

import java.util.*;

class Person{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		
		String name, marstatus, doorn, street, locality, city, state, country, qual, hobbies, gender, isaadhar, isphone, issalaried, phone;
		int age,dmy,pin,salary,expense;
		
		System.out.println("Name\t\t:");
		name=s.nextLine();
		
		System.out.println("Gender(Male-M/Female-F/Others-O)\t:");
		gender=s.next();
		
		System.out.println("DOB (DDMMYYYY)\t:");
		dmy=s.nextInt();
		
		System.out.println("Age\t\t:");
		age=s.nextInt();
		
		System.out.println("Marital status\t:");
		marstatus=s.next();
		
		System.out.println("Door number\t:");
		doorn=s.next();
		s.nextLine();
		System.out.println("Street\t\t:");
		street=s.nextLine();
		
		System.out.println("Locality\t\t:");
		locality=s.nextLine();
		
		System.out.println("City\t\t:");
		city=s.nextLine();
		
		System.out.println("State\t\t:");
		state=s.nextLine();
		
		System.out.println("Country\t\t:");
		country=s.nextLine();

		System.out.println("PinCode\t\t:");
		pin=s.nextInt();
		
		System.out.println("IsAadharAvailable (Y/N)\t:");
		isaadhar=s.next();
		
		System.out.println("IsTelephoneAvailable (Y/N)\t:");
		isphone=s.next();
		
		System.out.println("Phone Number\t:");
		phone=s.next();
		s.nextLine();
		System.out.println("Qualification\t:");
		qual=s.nextLine();
				
		System.out.println("IsSalaried? (Y/N)\t:");
		issalaried=s.next();
		
		System.out.println("Monthly Salary\t:");
		salary=s.nextInt();
		
		System.out.println("Monthly Expense\t:");
		expense=s.nextInt();
		s.nextLine();
		System.out.println("Hobbies\t\t:");
		hobbies=s.nextLine();			
		
		System.out.println("\n\nName\t:\t"+name.toUpperCase()+"\nGender\t:\t"+gender.toUpperCase()+"\nDOB\t:"+dmy+"\nAge\t:"+age+"\nMarital Status\t:"+marstatus.toUpperCase()+"\nDoor Number\t:"+doorn+"\nStreet\t:"+street.toUpperCase()+"\nLocality\t:"+locality.toUpperCase()+"\nCity\t:"+city.toUpperCase()+"\nState\t:"+state.toUpperCase()+"\nCountry\t:"+country.toUpperCase()+"\nPinCode\t:"+pin+"\nIsAadharAvailable\t:"+isaadhar.toUpperCase()+"\nIsTelephoneAvailable\t:"+isphone.toUpperCase()+"\nPhone Number\t:"+phone+"\nQualification\t:"+qual.toUpperCase()+"\nIsSalaried\t:"+issalaried.toUpperCase()+"\nMonthly Salary\t:"+salary+"\nMonthly Expense\t:"+expense+"\nHobbies\t:"+hobbies);
		

	}
}
