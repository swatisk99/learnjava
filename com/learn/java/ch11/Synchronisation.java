package com.learn.java.ch11;
class MyObject{
	/**
	 * The method will only be used by any one thread at a time.
	 * Only after exiting the method another thread can use it.    
	 * <p>If <code>synchronized</code> was not used, <code>sleep()</code>, this method allows execution to switch to another
	 * thread. Thus, the output of all the threads would've been mixed up.</p>
	 * @param word
	 */
	synchronized void methodCall(String word) {	
		try{
			System.out.println("Length of the string "+word.length());
			Thread.sleep(100);
			System.out.println("Method called for word : "+word);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	void callAsynchronousMethod(String word) {
		try{
			System.out.println("Word in uppercase "+word.toUpperCase());
			Thread.sleep(100);
			System.out.println("Method was called for word : "+word);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}	
}
class MyThread implements Runnable{
	String word;
	MyObject object;
	Thread t;
	MyThread(MyObject object,String word){
		t = new Thread(this);
		this.word = word;
		this.object = object;
		t.start();
	}
	@Override
	public void run() {
		//t.start();		//IllegalThreadStateException
		object.methodCall(word);
		object.callAsynchronousMethod(word);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n");
		//	asynchronous method will behave in synchronized manner for the object, i.e, this block ensures that a call to a
		//	method that is a member of object occurs only after the current thread has successfully entered object’s monitor.
		synchronized(object){
			System.out.println("Sync block");
			object.callAsynchronousMethod(word);
		}
	}
}
public class Synchronisation {
	public static void main(String[] args) {
		MyObject object = new MyObject();
		new MyThread(object,"swati");
		new MyThread(object,"krishna");
		new MyThread(object,"kochi");	
	}
}