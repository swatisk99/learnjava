//$Id$
package com.learn.java.collections;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		//System.out.println(Runtime.getRuntime().availableProcessors());
		Random rd = new Random();
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 1; i <= 5; i++ ) {
			hm.put(i, rd.nextInt(100));
		}
		System.out.println(hm);
		//hm.forEach((k,v)->hm.computeIfPresent(k, (l,w)->w+10));
		hm.forEach((k,v)->hm.put(k, v+10));
		System.out.println(hm);		
		
	}
}
