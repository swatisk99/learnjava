//$Id$
package com.learn.java.ch11.quest;

import java.math.BigInteger;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SumFinder implements Callable<BigInteger>{
	BigInteger a, b;
	SumFinder(BigInteger a, BigInteger b){
		this.a = a;
		this.b = b;
	}
	public BigInteger summer() {
		BigInteger localSum = BigInteger.ZERO;
		for(BigInteger i = a.add(BigInteger.ONE) ; i.compareTo(b) < 1;i=i.add(BigInteger.ONE)){	
			localSum = localSum.add(i);
		}
		return localSum;
	}
	@Override
	public BigInteger call() throws Exception {
		return summer();
	}
	
}
public class Sum {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService e = Executors.newFixedThreadPool(3);
		BigInteger start = BigInteger.valueOf(0), end = BigInteger.valueOf(10000);
		Future<BigInteger> f1,f2,f3,f4;
		f1 = e.submit(new SumFinder(start,end));
			start = BigInteger.valueOf(10000); end = BigInteger.valueOf(20000);
		f2 = e.submit(new SumFinder(start,end));
			start = BigInteger.valueOf(20000); end = BigInteger.valueOf(30000);
		f3 = e.submit(new SumFinder(start,end));
			start = BigInteger.valueOf(30000); end = BigInteger.valueOf(40000);
		f4 = e.submit(new SumFinder(start,end));
		e.shutdown();				//Program will not terminate if e is not shutdown
		BigInteger sum = f1.get().add(f2.get().add(f3.get().add(f4.get())));
		System.out.println(sum+" = "+f1.get()+" + "+f2.get()+" + "+f3.get()+" + "+f4.get());
	}

}
