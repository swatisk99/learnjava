//$Id$
package com.learn.java.collections;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i=0;i<3;i++) {
			arrayList.add(i);
		}
		long endTime   = System.nanoTime();
		System.out.println("Array creation time : "+ (endTime-startTime));

		System.out.println(arrayList);
		List<Integer> array1 = Arrays.asList(1,2,3,4,5);
		System.out.println("Array1 : "+array1);
		Integer [] array2 = {1,3,5,6};
//		Collections.addAll(arrayList,array1);	//The method addAll(Collection<? super T>, T...) in the type Collections is not applicable for the arguments (ArrayList<Integer>, List<Integer>)
		arrayList.retainAll(array1);
		System.out.println("Retaining elements of array1 in arrayList : "+arrayList);
		System.out.print("Array2 : ");
		for(Integer val : array2) {	System.out.print(val+" ");	}
		Collections.addAll(arrayList,array2);
		Object[] array3 = arrayList.toArray();
		System.out.println("\nArray 3 : "+array3.length);
		System.out.println("Add array2 : "+arrayList);
		System.out.println("Contains 1 :"+arrayList.contains(1));
		System.out.println("IsEmpty? :"+arrayList.isEmpty());
		System.out.println(arrayList.get(3));
		System.out.println("Contains 1,2,3,4,5 : "+arrayList.containsAll(array1));
		arrayList.remove(3);
		System.out.println("Removed 3 : "+arrayList);
		arrayList.removeAll(array1);
		System.out.println("Removed 1,2,3,4,5 : "+arrayList);
		System.out.println("Index of 6 : "+arrayList.indexOf(6));
		//System.out.println(arrayList.iterator());
		arrayList.clear();
		System.out.println(arrayList);
		System.out.println("IsEmpty? :"+arrayList.isEmpty());
		arrayList.add(0, 14);
		arrayList.add(0,17);
		arrayList.set(1, 11);
		System.out.println("Set element in index 1 to 11 : "+arrayList);
		//Iterator enable forward traversing
		Iterator<Integer> it = arrayList.iterator();
		int i =0;
		System.out.println("Traversing in forward fashion ");
		while(it.hasNext()) {
			System.out.println(i++ +"->"+it.next());
		}
		i = arrayList.size()-1;
		//ListIterator enables bidirectional traversing
		ListIterator<Integer> lit = arrayList.listIterator(i);
		System.out.println("Traversing in backward fashion ");
		while(lit.hasPrevious()) {
			System.out.println(i-- +"->"+lit.previous());
		}
		//for each number in array list : this function is performed
		arrayList.forEach(number->addTen(number));
		LinkedList<Integer> ll1 = new LinkedList<>(Arrays.asList(9,0,2,4));
		arrayList.addAll(1, ll1);
		System.out.println("Linked list 1 : "+ll1+"\nAdding linked list1 to arrayList : "+arrayList);
		System.out.println("First elements of LL : "+ll1.getFirst());
		ll1.addFirst(13);
		ll1.addLast(10);
		System.out.println("Adding 13 first and 10 last to linked list : "+ll1);
		ll1.clear();
		System.out.println(ll1.pollLast());	//null
//		ll1.removeLast();		//Throws NoSuchElementException
		startTime = System.nanoTime();
		LinkedList<Integer> ll = new LinkedList<>();
		for(i=0;i<3;i++) {
			ll.add(i);
		}
		endTime   = System.nanoTime();
		System.out.println("LL creation time : "+ (endTime-startTime));
		startTime = System.nanoTime();
		System.out.println(arrayList.get(2));
		endTime   = System.nanoTime();
		System.out.println("Array elt access time : "+ (endTime-startTime));
		
		startTime = System.nanoTime();
		System.out.println(ll.get(2));
		endTime   = System.nanoTime();
		System.out.println("LL elt access time : "+ (endTime-startTime));
		Integer [][] array4 = {{1,3,5,6},{2,3,4,5}};
		Integer [][] array5 = {{1,3,5,6},{2,3,4,5}};
		System.out.println(Arrays.deepEquals(array4, array5));		//for nested arrays

	}
	static void addTen(int number) {
		System.out.println(number+10);
	}
	
	
}
