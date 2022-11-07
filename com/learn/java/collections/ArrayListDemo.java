//$Id$
package com.learn.java.collections;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> collection = new ArrayList<>();
		for(int i=0;i<3;i++) {
			collection.add(i);
		}
		System.out.println(collection);
		List<Integer> array1 = Arrays.asList(1,2,3,4,5);
		System.out.println("Array1 : "+array1);
		Integer [] array2 = {1,3,5,6};
//		Collections.addAll(collection,array1);	//The method addAll(Collection<? super T>, T...) in the type Collections is not applicable for the arguments (ArrayList<Integer>, List<Integer>)
		collection.retainAll(array1);
		System.out.println("Retaining elements of array1 in collection : "+collection);
		System.out.print("Array2 : ");
		for(Integer val : array2) {	System.out.print(val+" ");	}
		Collections.addAll(collection,array2);
		Object[] array3 = collection.toArray();
		System.out.println("\nArray 3 : "+array3.length);
		System.out.println("Add array2 : "+collection);
		System.out.println("Contains 1 :"+collection.contains(1));
		System.out.println("IsEmpty? :"+collection.isEmpty());
		System.out.println(collection.get(3));
		System.out.println("Contains 1,2,3,4,5 : "+collection.containsAll(array1));
		collection.remove(3);
		System.out.println("Removed 3 : "+collection);
		collection.removeAll(array1);
		System.out.println("Removed 1,2,3,4,5 : "+collection);
		System.out.println("Index of 6 : "+collection.indexOf(6));
		//System.out.println(collection.iterator());
		collection.clear();
		System.out.println(collection);
		System.out.println("IsEmpty? :"+collection.isEmpty());
		collection.add(0, 14);
		collection.add(0,17);
		ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(9,0,2,4));
		collection.addAll(1, array4);
		System.out.println("Array4 : "+array4+"\nAdding array4 to collection : "+collection);
		collection.set(2, 11);
		System.out.println("Set element in index 2 to 11 : "+collection);
		Iterator<Integer> it = collection.iterator();
		int i =0;
		System.out.println("Traversing in forward fashion ");
		while(it.hasNext()) {
			System.out.println(i++ +"->"+it.next());
		}
		i = collection.size()-1;
		ListIterator<Integer> lit = collection.listIterator(i);
		System.out.println("Traversing in backward fashion ");
		while(lit.hasPrevious()) {
			System.out.println(i-- +"->"+lit.previous());
		}
	}
}
