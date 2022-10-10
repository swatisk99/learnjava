package com.learn.java.ch9.abstracts;

import com.learn.java.ch9.interfaces.Library;
import com.learn.java.ch9.interfaces.Library.Book;

public class Sample {
	
	public static void main(String args[]) {
		Library.Book object = new Library.Book(15154,"01/01/2022","10/10/2022","Harry Potter","Swati");
	    object.issueBook();
	    
	}
}
