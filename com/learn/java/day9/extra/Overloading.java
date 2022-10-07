package com.learn.java.day9.extra;
class OneMethod{
		void doMethod(A obj) {
			System.out.println("A");
		}
		void doMethod(B obj) {
			System.out.println("B");
		}
		void doMethod(D obj) {
			System.out.println("C");
		}
		void doMethod(Object obj) {
			System.out.println("Object");
		}
		
		void doMethod(char c) {
			System.out.println("Character");
		}
}
public class Overloading {

	public static void main(String[] args) {
		char c = '\u0000'; //=='\0'== (char) 0 ==>	nullcharacter
		OneMethod obj = new OneMethod();
		obj.doMethod(c);
		obj.doMethod(null);
		
		
	}

}
