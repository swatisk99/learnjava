package com.learn.java.intro;

import java.io.IOException;

public class HelloWorld{
	public static void main(String args[]) throws IOException{
		 
		 System.out.println("Hello world \\\\n  \uD83D\uDE0A");
		 byte[] helloworld = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33, 8,87, 111, 114, 108, 100, 33, 8, 13};
		 System.out.write(helloworld);	
		 byte[] hello = {87, 111, 114, 108, 100, 33, 8, 13};	
		  System.out.write(hello);
	}
}