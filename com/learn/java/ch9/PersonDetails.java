package com.learn.java.ch9;

public interface PersonDetails {
	String NICKNAME = new String();
	public static final StringBuilder NAME = new StringBuilder();
	public static final int age = 0;		//implicitly public(since this interface is public) static and final
	static final int marks=100;
	
	void setName(String name);
	
	StringBuilder getName();
	
}