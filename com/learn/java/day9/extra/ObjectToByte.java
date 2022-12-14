package com.learn.java.day9.extra;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class ObjectToByte{
	public static void main(String args[]) throws IOException,ClassNotFoundException{
		FileOutputStream fout = new FileOutputStream("hello.txt");
		try (ObjectOutputStream o = new ObjectOutputStream(fout)) {
			Student s = new Student(15154,"Swati","Krishna");
			o.writeObject(s);
			o.flush();
		}
		try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("hello.txt"))) {
			Student st = (Student)oi.readObject();
			System.out.println(st.id+". . . "+st.name+". . ."+st.transientName);
		}
		
	}
}
class Student implements Serializable{
	int id;
	String name;
	transient String transientName;
	
	public Student(int id,String name,String tName){
		this.id=id;
		this.name=name;
		transientName=tName;
	}
}