package com.learn.java.day9;

class This{
	int value;
	String name;
	boolean isTrue;
	char character;
	float fvalue;
	
	This(){
		//this(2);		==>Calling parameterized constructor from default constructor
	}
	This(int value){
		this();
		this.value = value;
		this.name = "Swati";
		
	}
	
	This(This object){
		this(object.value);
	}
	void displayThis() {
		System.out.println(value+", "+name+", "+isTrue+", "+character+", "+fvalue);
	}
	void show(This this,This obj) {
		System.out.println(this.name+"  "+name+"  "+obj.name+"\n");
		System.out.println(this.name);
		//this.displayThis(); == displayThis();
		
	}
	void createClone() {
		This object = new This(this);
		System.out.println("Objects after cloning : "+object+"\t"+this);
	}
	
}

class ThisUses {

	public static void main(String[] args) {
		This obj1 = new This();
		System.out.println("Default values of different datatypes : ");
		obj1.displayThis();
		
		This obj2 = new This(12);
		obj2.displayThis();
		obj1.show(obj2);
		
		obj2.createClone();
		//System.out.println(obj2);
		
		
	}

}
