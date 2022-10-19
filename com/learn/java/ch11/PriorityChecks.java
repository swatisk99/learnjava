package com.learn.java.ch11;

class ThisThread implements Runnable {
	long value = 0;
	Thread t;
	StringBuffer lowPrioThreadBuffer = new StringBuffer("");
	static int offset = 0;
	private volatile boolean running = true;
	public ThisThread(int p,String name) {
		t = new Thread(this,name);
		t.setPriority(p);
	}
	public  void run() {
		while (running) {
			if(t.getName()=="Low Priority thread") {
				System.out.print(".");
				lowPrioThreadBuffer.insert(offset,(value++)+" ");
				offset = lowPrioThreadBuffer.length();
			}
			else {

				System.out.println(t.getName()+" -> "+value++);
			}
		}
	}
	public void stop() {
		running = false;
		System.out.println(lowPrioThreadBuffer);
	}
	public void start() {
		t.start();
	}
}
public class PriorityChecks {
	public static void main(String args[]) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		ThisThread highPriorityThread = new ThisThread(Thread.NORM_PRIORITY + 4,"High Priority thread");		//Doesn't have a uniform execution of threads each time...In the end high priority thread would have 
		ThisThread lowPriorityThread = new ThisThread(Thread.NORM_PRIORITY - 2,"Low Priority thread");
		lowPriorityThread.start();
		highPriorityThread.start();
		try {
			Thread.sleep(10);
		} 
		catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		lowPriorityThread.stop();
		highPriorityThread.stop();
		// Wait for child threads to terminate.
		try {
			highPriorityThread.t.join();
			lowPriorityThread.t.join();
		} 
		catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		System.out.println("Low-priority thread: " + lowPriorityThread.value);
		System.out.println("High-priority thread: " + highPriorityThread.value);
	}
}