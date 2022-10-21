package com.learn.java.ch11;
class FirstThread implements Runnable{
	FirstThread(){		
		new Thread(this).start();;
	}

	@Override
	public void run() {
		while(true) {
			useString1();
		}
	}
	/**
	 * Method blocks string1 and sleeps for 1s to later block string2..But Method in SecondThread would've already blocked string2
	 */
	void useString1() {
		System.out.println("Method in FirstThread");
		synchronized(Deadlock.str1) {
			System.out.print("Sync block for str1 in FirstThread : str2 = ");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println(e);
			}
			synchronized(Deadlock.str2) {
				System.out.println(Deadlock.str2);
			}
		}
	}

}
class SecondThread implements Runnable{
	SecondThread(){
		new Thread(this).start();
	}

	@Override
	public void run() {
		while(true) {	
			useString2();
		}
	}
	void useString2() {
		//Just to show how first time deadlock did not occur
		try {
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("\nMethod in SecondThread");
		synchronized(Deadlock.str2) {
			System.out.print("Sync block for str2 in FirstThread : str1 = ");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println(e);
			}
			synchronized(Deadlock.str1) {
				System.out.println(Deadlock.str1);
			}
		}
	}
}
public class Deadlock {
	static String str1="idc",str2="djkcn";
	public static void main(String[] args) {
		new FirstThread();
		new SecondThread();
	}

}
