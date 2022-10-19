package com.learn.java.ch9.quest;


class A{
	void method8() {
		System.out.println("8");
	}
}
class B extends A implements I1,I2,I3{
	void method9() {
		System.out.println("9");
	
	}
}
class C extends B implements I4,I5,I6,I7{
	void method10() {
		System.out.println("10");
	
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		C c = new C();
		B b = c;
		A a = b;
		
		I7 d = (I7) a;
		d.method7();
		
		I7 e = c;
		
		I3 f = c;
		I3 g = b;
		B h = (B)a;
		h.method3();
		
		
	}

}
