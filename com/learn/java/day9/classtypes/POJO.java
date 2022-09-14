package com.learn.java.day9.classtypes;

class Value{
	private int value;
	void setValue(int value) {
		this.value = value;
	}
	int getValue() {
		return value;
	}
}
public class POJO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value object = new Value();
		object.setValue(14);
		System.out.println("Value set in object is : "+object.getValue());
	}

}
