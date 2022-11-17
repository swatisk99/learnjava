package com.learn.java.ch11.quest;

import java.math.BigInteger;
import java.util.Scanner;
	
class SummingThread implements Runnable{
	//private static long sum = 0;
	private BigInteger localSum=BigInteger.ZERO;
	BigInteger a,b;
	SummingThread(BigInteger a,BigInteger b){
		this.a = a;
		this.b = b;
	}
	public void addForRange()  {
		for(BigInteger i=a.add(BigInteger.ONE); i.compareTo(b) < 1; i=i.add(BigInteger.ONE)) {
//			System.out.println(localSum);
			localSum = localSum.add(i);
		}
	}	
	public BigInteger getSum() {
		return localSum;
	}
	@Override
	public void run() {
		addForRange();
	}	
}
public class Summing {
	volatile BigInteger sum=BigInteger.ZERO;
	final static BigInteger TWO = BigInteger.valueOf(2);
	public static void main(String[] args) throws InterruptedException {
		Summing obj = new Summing();
		System.out.println("Enter number");
//		BigInteger splitValue = new BigInteger("1000");
		try(Scanner scanner = new Scanner(System.in)) {
			BigInteger value = scanner.nextBigInteger();
//			if(value.compareTo(splitValue) < 1) {
				long start,end; 
				start = System.nanoTime();
				SummingThread s1 = new SummingThread(BigInteger.ZERO,value);
				s1.addForRange();	
				end = System.nanoTime();
				System.out.println(s1.getSum()+"\nTime for single thread : "+(end-start));
//			}
//			else {
				Summing obj1 = new Summing();
				start = System.nanoTime();
				SummingThread s3 = new SummingThread(BigInteger.ZERO,value.divide(TWO));
				SummingThread s2 = new SummingThread(value.divide(TWO),value);
				s2.addForRange();
				Thread t1 = new Thread(s3);
				t1.start();
				t1.join();
				obj1.sum = obj1.sum.add(s3.getSum());
				obj1.sum = obj1.sum.add(s2.getSum());
				end = System.nanoTime();
				System.out.println(obj1.sum+"\nTime for multi thread : "+(end-start));
//			}
		}
		catch(Exception e) {
			System.out.println(e);
		}		
	}
}
