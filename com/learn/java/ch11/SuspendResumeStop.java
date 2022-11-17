package com.learn.java.ch11;
class AThread implements Runnable{
	boolean running=true,suspendFlag=false;
	Thread t;
	AThread(String name){
		t = new Thread(this,name);
		t.start();
	}
	@Override
	public void run() {
		int i=0;
		while(running) {
			try{
				Thread.sleep(100);
				System.out.println(t.getName()+" : "+i++);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			//this thread is blocked and checked whether ,code>suspendFlag</code> is true.
			//if so, suspends thread,i.e, waits till flag set to false
			synchronized(this) {
				while(suspendFlag) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	public void suspend() {
		suspendFlag=true;
	}
	synchronized public void resume() {
		suspendFlag=false;
		//notifies the thread 
		notify();
	}
	public void stop() {
		running=false;
	}
}
public class SuspendResumeStop {
	public static void main(String[] args) {
		AThread thread1 = new AThread("thread1");
		AThread thread2 = new AThread("thread2");
		try {
			thread1.suspend();
			Thread.sleep(1000);
			System.out.println("Thread1 is suspended");
			thread2.suspend();
			Thread.sleep(1000);
			System.out.println("Thread2 is suspended");
			Thread.sleep(2000);
			System.out.println("Thread2 is resumed");
			thread2.resume();
			Thread.sleep(1000);
			System.out.println("Thread1 is resumed");
			thread1.resume();
			Thread.sleep(1000);
			thread1.stop();
			Thread.sleep(1000);
			System.out.println("Thread1 is stopped");
			thread2.stop();
			Thread.sleep(1000);
			System.out.println("Thread2 is stopped");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
