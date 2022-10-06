package com.learn.java.day9;
class AClass{
	static final int TEN=10;
	/**
	 * if you'are creating a library (or working on a part of a big project),
	 * so your clients are not able to extend the class and modify the existing behavior.
	 * Static inner classes are for things that logically belongs to an outer (containing) class 
	 * but which have no dependencies on the state of the outer class. 
	 * REFER: https://stackoverflow.com/questions/19151911/static-classes-and-final-classes-in-java
	 *
	 */
	static final class In{
		int number=1;
		void print() {
			System.out.println("Static final nested class");
		}
	}
	//class InExtend extends In{}		The type InExtend cannot subclass the final class AClass.In
	static final void doSomething() {
		System.out.println("Did Something");
	}
}
class AnotherClass extends AClass{
	/**
	 * The keyword final will disable the method from being hidden. 
	 * So they cannot be hidden and an attempt to do so will result in a compiler error.
	 */
	// void doSomething() {} This instance method cannot override(hide) the static method from AClass
}
public class StaticFinal {
	public static void main(String[] args) {
		AnotherClass o = new AnotherClass();
		System.out.println(AClass.TEN);		//TEN++ ==> ERROR
	}

}
