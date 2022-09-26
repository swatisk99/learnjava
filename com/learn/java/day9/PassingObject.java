package com.learn.java.day9;
class SomeObject{
	int value;
	SomeObject(){
		value=4;
	}
	SomeObject(int value){
			this.value=value;
		}
		//value=4;

	static void nullifyObject(SomeObject obj) {
		System.out.println(passToAnotherMethod(obj).value);
		obj=null;
	}
	static SomeObject passToAnotherMethod(SomeObject obj) {
		return null;
	}
}
public class PassingObject {

	public static void main(String[] args) {
		SomeObject obj = new SomeObject();
		System.out.println(obj.value);
		//SomeObject.nullifyObject(obj);
		System.out.println(obj.value);
		
		SomeObject obj1 = new SomeObject(5);
		System.out.println(obj1.value);
	}

}
