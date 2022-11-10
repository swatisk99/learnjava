//$Id$
package com.learn.java.collections;
import java.util.*;
class MyComparator implements Comparator<Integer>{
	
	@Override
	/**
	 * Normally o1>o2 return 1;o1<o2 returns -1;o1==o2 returns 0
	 * On overriding return value is changed so that max heap is obtained
	 */
	public int compare(Integer o1, Integer o2) {
		if(o1>o2){	return -1;	}
		if(o1<o2) {	return 1;	}
		return 0;
	}
}
/**
 * This DS uses heap.. always higher priority values are deleted automatically
 * Used in algorithms
 * @author swati-15154
 *
 */
public class PriorityQueDemo {

	public static void main(String[] args) {
		
//		PriorityQueue<Integer> pq = new PriorityQueue<>();	
		PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator());	
		Random random = new Random();
		int element;
		//By default follows minheap implementation unless Comparator implemented
		for(int i=0;i<5;i++) {
			element = random.nextInt(50);
			pq.add(element);
			System.out.println(element + " added.. "+pq.peek()+" is head of the priority queue.");
		}
		System.out.println(pq);
		//Always root of the heap is removed
		System.out.println(pq.poll()+" is removed. "+pq.peek()+" is head of the priority queue.");
		System.out.println(pq);

	}

}
