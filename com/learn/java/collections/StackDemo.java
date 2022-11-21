//$Id$
package com.learn.java.collections;

import java.util.*;
import java.util.stream.Collectors;

public class StackDemo {

	public static void main(String[] args) {
		Stack stck = new Stack();			//ArrayDeque is a better choice
		stck.push(1);
		System.out.println("Current capacity "+stck.capacity());
		System.out.println(stck);
		stck.push(17);
		stck.push(14);
		System.out.println(stck.peek());
		stck.push(17);
		stck.push(1);
		stck.push(2);
		stck.push(3);
		stck.push(4);
		stck.push(6);
		stck.push(7);
		//capacity doubled
		stck.push(8);
		System.out.println(stck.capacity());
		System.out.println("Removing "+stck.pop());			//EmptyStackException is thrown if stack empty
		System.out.println("14 is present in index : "+stck.search(14));
		System.out.println("1 is present in index : "+stck.search(1));
		System.out.println("12 is present in index : "+stck.search(12));
		Enumeration e =  stck.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		Vector<Integer> v = new Vector<>(stck);
		System.out.println("Current capacity "+v.capacity());
		System.out.println(v);
		v.add(19);
		v.add(21);
		System.out.println("Current capacity "+v.capacity());
		System.out.println(v);
		v.add(20);
		v.add(13);
		//capacity doubled each time current capacity exceeded if increment size not specified
		System.out.println("Current capacity "+v.capacity());
		System.out.println(v);
		//vector with non-default increment size
		Vector<Integer> v2 = new Vector<>(3,2);
		v2.add(19);
		v2.add(21);
		v2.add(20);
		System.out.println("Current capacity "+v2.capacity());
		System.out.println(v2);
		v2.add(13);
		System.out.println("Current capacity "+v2.capacity());
		System.out.println(v2);
//		System.out.println(v2.elementAt(4));		//java.lang.ArrayIndexOutOfBoundsException
		System.out.println(stck.stream().collect(Collectors.toList()));	//why deque preferred over stack: stack does not print in stack order
		Deque<Integer> dq = new ArrayDeque<>();
		dq.push(1);
		dq.push(2);
		dq.push(3);
		System.out.println(dq);
		System.out.println(dq.stream().collect(Collectors.toList()));
	}	
}
