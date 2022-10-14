package com.learn.java.ch9.quest;

import java.lang.reflect.*;
import java.time.LocalDate;

class PersonalDetails{
	private String fullName;
	private String dateOfBirth;
	private long aadharNumber;
	PersonalDetails(String name,String dob, long aNumber){
		fullName = name;
		dateOfBirth = dob;
		aadharNumber = aNumber;
	}
	
	public String getName() {
		return fullName;
	}
	
	private long getAadhar() {
		return aadharNumber;
	}
}

public class Reflection {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		PersonalDetails swati = new PersonalDetails("Swathi Krishna","14/08/1999",322417357236l);
		Field [] declaredFields = swati.getClass().getDeclaredFields();
		for(Field field : declaredFields) {
			System.out.println(field.getName());
		}
		System.out.println("\nMethods : ");
		Method [] methods = swati.getClass().getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		
		for(Field field : declaredFields) {
			if(field.getName().equals("fullName")) {
				field.setAccessible(true);
				field.set(swati,"Swati Krishna");
				//System.out.println(field.get(swati));
				break;
			}
		}
		swati.getName();
		
		for(Method method : methods) {
			if(method.getName().equals("getAadhar")) {
				method.setAccessible(true);
				System.out.println(method.invoke(swati));
				
			}
		}
		
		
	}

}
