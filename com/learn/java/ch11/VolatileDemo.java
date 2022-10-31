package com.learn.java.ch11;
	//volatile guarantees visibilty and used for read-write purposes
	

public class VolatileDemo {
	volatile static int counter = 0;
	public static void main(String[] args) {
		//without <code>volatile</code> the variable is not aware of the updation in the other thread therefore the changes donot occur
		//therefore only thread2 executed
		Thread t1 = new Thread(() -> {
			for (int cacheCounter = counter; counter < 10; cacheCounter = counter) {
				if (cacheCounter != counter) {
					System.out.println(Thread.currentThread().getName()+" : lastKnownCounter is " + cacheCounter + " and counter is " + counter);
				}
			}
		},"Thread1");
		//when variable is <code>volatile</code>,the change in counter is seen by Thread1
		Thread t2 = new Thread(() -> {
			while (counter++ < 10) {
				try {
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+" : counter is " + counter);
				} catch (Exception e) {
				}
			}
		},"Thread2");
		t1.start();
		t2.start();
		
	

	
	}

}
