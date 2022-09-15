package com.learn.java.day9.classtypes;


class Singleton{
	private int systemID;
	private static Singleton object;
	
	/**
	 * Step-1 
	 * Creating private constructor
	 */
	private Singleton() {
		systemID = 151548;
	}
	
	/**
	 * Step-2
	 * static method to return object of singleton class
	 * creates singleton object if not created already and returns it
	 * @return
	 */
	public static Singleton getObject() {
		if(object == null) {
			object = new Singleton();
		}
		return object;
	}
	
	public void setID(int id) {
		this.systemID = id;
	}
	
	public void getSystemID() {
		System.out.println("System ID : "+systemID);
	}
}
public class SingletonClass {

	public static void main(String[] args) {
		Singleton s = Singleton.getObject();
		s.getSystemID();
		s.setID(155555);
		Singleton t = Singleton.getObject();
		t.getSystemID();
		System.out.println("First object == second object? :"+(t==s));
	}

}
