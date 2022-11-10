//$Id$
package com.learn.java.collections;
import java.util.*;
import java.util.Map.Entry;
//class EmpComparator implements Comparator<String>{
//	public int compare(String o1, String o2) {
//		return (Integer.compare(Integer.parseUnsignedInt(o1), Integer.parseUnsignedInt(o2)));
//	}
//}
public class TreeMapDemo {
	
	public static void main(String[] args) {
		//Random rd = new Random();
		//Map in sorted order
		TreeMap<Integer,String> empDetails = new TreeMap<>();
		String empName;
		int empId;
		System.out.println("Number of employees : ");
		try(Scanner scanner= new Scanner(System.in)){
			int empStrength = scanner.nextInt();
			for(int i = 1 ; i <= empStrength ; i++,empDetails.putIfAbsent(empId , empName)) {	//using put for repeated key value will result in modified value
				System.out.print(i+")\tEmp id : ");
				empId = scanner.nextInt();
				scanner.nextLine();
				System.out.print("\tEmp Name : ");
				empName = scanner.nextLine();
			}
		}
		System.out.println(empDetails);
		System.out.println(empDetails.ceilingKey(15000));	//only corresponding key is returned
		Entry<Integer, String> empEntry = empDetails.ceilingEntry(15000);	
		System.out.println(empEntry);
		System.out.println("First employee "+empDetails.firstKey());
//		System.out.println(empDetails.tailMap(15000));
		System.out.println(empDetails.subMap(15000, true, 16000, false));	
//		for(Entry<String,String> entry : empDetails) { }	//Can only iterate over an array or an instance of java.lang.Iterable
		System.out.println(empDetails.entrySet());
		System.out.println(empDetails.keySet());
//		if(empDetails.containsKey(15000)) {
//			empEntry.getKey(15000).
//		}Future
		System.out.println(empDetails);
		
	}

}
