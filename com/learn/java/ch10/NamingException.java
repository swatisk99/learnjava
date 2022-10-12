package com.learn.java.ch10;

public class NamingException extends Exception {
//Have all methods available to Throwable. May override. 
		public NamingException() {
		super();
	}
	public NamingException(String message){
		super(message);
	}
	public NamingException(String message,Throwable cause) {
		super(message,cause);
	}
	public NamingException(Throwable cause) {
		super(cause);
	}
	public String toString() {
		
		return " ERROR : "+getClass().getName()+" : "+super.getMessage()+ (super.getCause()==null? "":"\n"+super.getCause());
	}
}
