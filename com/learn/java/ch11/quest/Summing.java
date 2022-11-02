package com.learn.java.ch11.quest;

import java.util.Scanner;
	
class SummingThread implements Runnable{
	private static long sum = 0;
	long a,b;
	SummingThread(long a,long b){
		this.a = a;
		this.b = b;
	}
	public long sumForRange()  {
		long localSum=0;
		for(long i=a+1; i <= b; i++) {
			localSum+=i;
		}
		sum += localSum;
		return sum;
	}
	public static long showSum() {
		return sum;
	}
	
	@Override
	public void run() {
		sumForRange();
	}
	
}
public class Summing {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter number");
		try(Scanner scanner = new Scanner(System.in)) {
			int value = scanner.nextInt();
			if(value<=10) {
				new SummingThread(0,value).sumForRange();
				System.out.println(SummingThread.showSum());
			}
			else {
				Thread t1 = new Thread(new SummingThread(0,value/5));
				Thread t2 = new Thread(new SummingThread(value/5,value/5*2));
				Thread t3 = new Thread(new SummingThread(value/5*2,value/5*3));
				Thread t4 = new Thread(new SummingThread(value/5*3,value/5*4));
				Thread t5 = new Thread(new SummingThread(value/5*4,value));
				t1.start();	t2.start();	t3.start();	t4.start();	t5.start();
				t1.join();	t2.join();	t3.join();	t4.join();	t5.join();
				System.out.println(SummingThread.showSum());
			}
		}
		
	}
}
