package com.learn.java.ch9.interfaces;

//import com.learn.java.ch9.a.OuterInterface.InnerInterface;

class ThisClass implements OuterInterface.InnerInterface,OuterInterface{

	@Override
	public void sayOuter() {
		System.out.println("I'm from OuterInterface : "+PI);
	}
	
	@Override
	public void sayInner() {
		System.out.println("I'm from Inner Interface");	//If only inner iface was implemented OuterInterface.PI could still be printed
	}
}


public class ImplementNestedIface{
	public static void main(String...args) {
		ThisClass object1 = new ThisClass();
		object1.sayInner();
		object1.sayOuter();
		
		OuterInterface  object2 = new ThisClass();
		//object2.sayInner();		//The method sayInner() is undefined for the type OuterInterface
		object2.sayOuter();
		
		OuterInterface.InnerInterface  object3 = new ThisClass();
		object3.sayInner();
		//object3.sayOuter();		//The method sayOuter() is undefined for the type OuterInterface.InnerInterface

		OuterInterface.saySomething();
		//OuterInterface.sayDefault();		//Cannot make a static reference to the non-static method sayDefault() from the type OuterInterface
		object2.sayDefault();
		
	}
}