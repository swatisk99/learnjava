package com.learn.java.intro;
import com.learn.java.day9.*;
public class ConstructorDifferentPackage {

	public static void main(String[] args) {
		//Box b = new Box(1,2);			==>The type Box is not visible
		//Accessing protected constructor
		//Box b1 = new Box(3,"Swati");
		Box b2 = new Box(4,5,"Krishna");
		System.out.println(b2.name+" ");
		
		//System.out.print(b2.d); 			==>	protected variable
		//System.out.print(b2.bname); 		==>	private variable
	
	}

}

