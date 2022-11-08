//$Id$
package com.learn.java.collections;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		//they use less memory than lists
		//Less computationally expensive since sets do not store indexed data or duplicates
		HashSet<Integer> hs =  new HashSet<>();
//		HashSet<Integer> hs =  new HashSet<>(20);

		hs.add(20);
		hs.add(16);
		hs.add(17);
		hs.add(10);
		hs.add(1);
		hs.add(5);
		hs.add(20);		//no repetition
		hs.add(null);
		//It makes no guarantees as to the iteration order of the set; in particular, 
		//it does not guarantee that the order will remain constant over time.
		System.out.println(hs);		
		Object [] array = hs.toArray();
		for(Object arrayElt : array) {
			System.out.print(arrayElt+" ");
		}
		//sets take less time to search through
		System.out.println("\nDoes the set contain 20? "+ (hs.contains(20)? "yes":"no"));
		
		HashSet<String> hs1 = new HashSet<String>(16,0.5f);
		hs1.add("B");
		hs1.add("A");
		hs1.add("D");
		hs1.add("E");
		hs1.add("C");
		hs1.add("F");
		hs1.add("G");
		hs1.add("H");
		hs1.add(null);	//null value is accepted
		System.out.println(hs1);
	}
}
