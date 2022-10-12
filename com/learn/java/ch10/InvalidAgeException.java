package com.learn.java.ch10;

public class InvalidAgeException extends RuntimeException {
	public InvalidAgeException() {
	}
	public InvalidAgeException(String message) {
		super(message);
	}
	public InvalidAgeException(String message,Throwable cause) {
		super(message,cause);
	}
	public InvalidAgeException(Throwable cause) {
		super(cause);
	}
}
