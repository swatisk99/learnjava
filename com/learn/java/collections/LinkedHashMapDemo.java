//$Id$
package com.learn.java.collections;

import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>(5,0.75f,true) {	//order of access //else new LinkedHashMap(5)
				protected boolean removeEldestEntry(Map.Entry e) {
					return size()>5;
				}
		};
		lhm.put(1, "Swati");
		lhm.put(2, "Krishna");
		lhm.put(3, "kjlk");
		lhm.put(4, "cdlkjioj");
		lhm.put(5, "kokdc");
//		lhm.put(6, "klsdo");	//6 would replace 1 since 1 is LRU
		lhm.get(1);
		lhm.get(2);
		lhm.get(1);
		lhm.put(6, "klsdo");
		System.out.println(lhm);
	}

}
