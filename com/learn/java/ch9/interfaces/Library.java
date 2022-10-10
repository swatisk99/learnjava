package com.learn.java.ch9.interfaces;

public interface Library {
	   public void issueBook();
	   void retrieveBook();
	   public class Book implements Library {
		   public Book(int bId, String dOI, String rD,String bN, String mN){
			   bookId = bId;
			   dateOfIssue = dOI; 
			   returnDate = rD;
			   bookName = bN;
			   memberName = mN;
		   }
		   public int bookId;
		   public String bookName, memberName,dateOfIssue,returnDate;
		   
		   public void issueBook() {
			   System.out.println("issued : "+bookName+" to "+memberName );
		   }
		   public void retrieveBook() {
			   System.out.println("book retrieved");
		   } 
	   }
		   
	}