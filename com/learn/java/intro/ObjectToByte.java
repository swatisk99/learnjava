package com.learn.java.intro;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class ObjectToByte{
	public static void main(String args[]){
		Student s = new Student(15154,"Swati");
		try{
			FileOutputStream fout = new FileOutputStream("hello.txt");
			ObjectOutputStream o = new ObjectOutputStream(fout);
			o.writeObject(s);
			o.flush();
		
			FileInputStream file = new FileInputStream("hello.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            Student st = (Student)in.readObject();
            System.out.print(st.id+".\n."+st.name);

		}
  
        catch (Exception e) {
        	System.out.print(e.toString());
        }
	}
}
class Student{
	int id;
	String name;
	public Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}