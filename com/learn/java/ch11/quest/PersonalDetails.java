//$Id$
package com.learn.java.ch11.quest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalDetails {
		public static List<String> names = new ArrayList<>(Arrays.asList("Swati","Sweta","Sweety","Swara"));
		public static List<Integer> age = new ArrayList<>(Arrays.asList(21,22,23,24));
		public static List<Integer> salary = new ArrayList<>(Arrays.asList(20000,25000,30000,35000));	
		public static void printDetails(int index) {
			System.out.println(names.get(index)+" "+age.get(index)+" "+salary.get(index));
	}
	enum Name{
		SWATI(21,20000),
		SWETA(22,25000),
		SWEETY(23,30000),
		SWARA(24,35000);
		int age, salary;
		Name(int age,int salary){
			this.age = age;
			this.salary = salary;
		}
		void printDetails(int index) {
			Name person = Name.values()[index];
			System.out.println("NAME : "+person+" AGE : "+person.age+" SALARY : "+person.salary);
		}
	}
}
