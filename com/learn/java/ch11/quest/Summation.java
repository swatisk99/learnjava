package com.learn.java.ch11.quest;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.*;
class SummingThreadd implements Runnable{
	private volatile BigInteger sum = new BigInteger("0");
	BigInteger a,b;
	SummingThreadd(BigInteger a,BigInteger  b){
		this.a = a;
		this.b = b;
	}
	public BigInteger sumForRange()  {
		BigInteger localSum=BigInteger.ZERO;
		for(BigInteger  i=a.add(BigInteger.ONE); i.compareTo(b)<=0 ; i.add(BigInteger.ONE)) {
			localSum = localSum.add(i);
		}
		sum = sum.add(localSum);
		System.out.println(localSum);
		return sum;
	}
	public BigInteger showSum() {
		return sum;
	}
	
	@Override
	public void run() {
		System.out.println("hi"+sum);
		sumForRange();
	}
}	

public class Summation {
	public static void main(String[] args) {
		System.out.println("Enter number");
		try(Scanner scanner = new Scanner(System.in)) {
			ExecutorService pool = Executors.newFixedThreadPool(3);
			BigInteger value = scanner.nextBigInteger();
			BigInteger valueByTen = value.divide(BigInteger.TEN);
			BigInteger value1 = BigInteger.ZERO;
			for(int i=0;i<10;i++) {
				Runnable thread = new SummingThreadd(value1,value1.add(valueByTen));
				value1 = value1.add(valueByTen);
				pool.execute(thread);
			}
			pool.shutdown();
			while(!pool.isTerminated()){	//waiting till pool threads terminate
			}
			//t1.join();	t2.join();	t3.join();	t4.join();	t5.join();
			System.out.println();		
		}
	}
}
