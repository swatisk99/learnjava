package com.learn.java.ch11;
	//volatile guarantees visibilty and used for read-write purposes
	

public class VolatileDemo {
	volatile static int counter = 0;
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int cacheCounter = counter; counter < 10; cacheCounter = counter) {
				if (cacheCounter != counter) {
					System.out.println(Thread.currentThread().getName()+" : lastKnownCounter is " + cacheCounter + " and counter is " + counter);

				}
			}
		},"Thread1");

			Thread t2 = new Thread(() -> {
				while (counter++ < 10) {
					System.out.println(Thread.currentThread().getName()+" : counter is " + counter);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			},"Thread2");
			t1.start();
			t2.start();
		
	

	
	}

}
