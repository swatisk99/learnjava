package com.learn.java.ch3.self;
import java.math.*;
import java.util.*;

class LargeValues {

	public static void main(String[] args) {
		/*	long lo=8328673647637469487237l; 
		  ===>Exception in thread "main" java.lang.Error: Unresolved compilation problems: The literal 8328673647637469487237l of type long is out of range. l cannot be resolved to a variable*/
		//double d=0.8398789478483748648723879078978970797877398;  ===>0.8398789478483749
		double d=2098.6890E-100;
		BigInteger bi=new BigInteger("8328673647637469487237");
		BigDecimal bd=new BigDecimal("0.839878947848374834872387398");
		Scanner sc=new Scanner(System.in);
		System.out.println(bi+"\n"+bd+"\n"+Double.MIN_VALUE+"\n"+d);
	}

}
