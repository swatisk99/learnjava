package com.learn.java.ch11;
class SecondThread implements Runnable{
	Thread t;
	SecondThread (){
		t = new Thread(this,"Runnable Thread");
		System.out.println(t);
		t.start();
		
	}
	
	public void run() {
		try {	
			for (int i = 0 ; i < 5 ; i++) {
				System.out.println("Runnable thread .."+i);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException ie) {
				System.out.println("Runnable thread interrupted");
		}	
	}
}
/**
 * Many Java programmers feel that classes should be
 * extended only when they are being enhanced or modified in some way. So, if you will not
 * be overriding any of Thread’s other methods, it is probably best simply to implement Runnable. 
 */
class ThirdThread extends Thread{
	ThirdThread(){
		super("Extended Thread");
		System.out.println(this);
		setPriority(7);
		start();
	}
	//When extending Thread, only method that must be overridden is run( ).
	public void run() {
		try {	
			for (int i = 0 ; i < 5 ; i++) {
				System.out.println("Extended thread .."+i);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException ie) {
				System.out.println("Extended thread interrupted");
		}	
	}	
}

public class TryThreading{

	public static void main(String[] args) {
		new SecondThread();
		new ThirdThread();
		Thread current = Thread.currentThread();
		System.out.println(current);
		try {
			for (int i = 0 ; i < 5 ; i++) {
				System.out.println("Main thread .."+i);
				Thread.sleep(1000);
			}
			System.out.println("Main thread ended");
		}catch(Exception e) {
			System.out.println("Main thread interrupted");

		}
	}

}
