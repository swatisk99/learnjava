//$Id$
package com.learn.java.collections;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.TreeMap;
import java.util.TreeSet;

public class StudentDB extends RankList{

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("StudentDB.txt");
	        ObjectInputStream in = new ObjectInputStream(file);
	        TreeSet<StudentMarks> rankList = (TreeSet<StudentMarks>)in.readObject();
	        System.out.println(rankList);
	        TreeMap<String,Float> studentDB = new TreeMap<>();
	        rankList.forEach(x->{studentDB.put(x.rollNo, x.totalMarks);});
	        System.out.println(studentDB);
//	        System.out.println(rankList instanceof Serializable);
		}
	    catch (Exception e) {
	    	System.out.print(e.toString());
	    }	
	}
}
