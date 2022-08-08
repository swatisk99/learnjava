package com.learn.java.ch3; 
import java.util.*;
class GeometricalCalculations{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		float r,t;
		System.out.println("\n\nSide of square");
		r=s.nextFloat();
		System.out.println("Area : "+(r*r));
		System.out.println("Sides of rectangle");
		r=s.nextFloat();
		t=s.nextFloat();
		System.out.println("Area : "+(r*t));
		System.out.println("Circle radius");
		t=s.nextFloat();
		System.out.println("Area : "+(Math.PI*t*t));	
	}
}