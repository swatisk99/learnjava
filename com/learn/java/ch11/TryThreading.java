package com.learn.java.ch11;
class SecondThread implements Runnable{
	Thread t;
	static int a = 1;
	SecondThread (){
		t = new Thread(this,"Runnable Thread");
		System.out.println(t);
		//sets thread to non-user thread
		t.setDaemon(true);
		//t.run();
		//System.out.println(t.isAlive());			//false
		t.start();
		System.out.println(t.isAlive());			//true

		
	}
	
	public void run() {
		try {	
			for (int i = 0 ; i < 30 ; i++) {
				System.out.println("Runnable thread .."+(i));
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
	static int i=0;
	ThirdThread(){
		super("Extended Thread");
		setPriority(7);
		System.out.println(this);
		start();
	}
	//When extending Thread, only method that must be overridden is run( ).
	public void run() {
		try {	
			Thread.currentThread().setName(getName()+i++);
			for (int i = 0 ; i < 10 ; i++) {
				System.out.println("Extended thread .."+i);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException ie) {
				System.out.println("Extended thread interrupted");
		}	
		finally {
			System.out.println(Thread.currentThread());
		}
	}	
}
public class TryThreading{

	public static void main(String[] args) {	
		SecondThread a = new SecondThread();
		ThirdThread c = new ThirdThread();
		//Tests if this thread is alive
		System.out.println(a.t.isAlive());
		Thread current = Thread.currentThread();
		System.out.println(current);
		try {
			for (int i = 0 ; i < 5 ; i++) {
				System.out.println("Main thread .."+i);
				//thread pauses for 4s
				Thread.sleep(400);
			}
			//waits for thread c for 0.4s
			c.join(2000);
			System.out.println(current.isAlive());
			//waits for thread c to complete execution
			c.join();
			System.out.println("Main thread ended");

		}catch(Exception e) {
			System.out.println("Main thread interrupted");
		}
		finally {
			//Number of currently active threads
			System.out.println(Thread.activeCount());
		}
	}

}
