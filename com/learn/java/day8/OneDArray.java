package com.learn.java.day8;


public class OneDArray {

	public static void main(String[] args) {
		long[] array= {1,2,10,14,17,-3,5,7,8};
		int i;
		long big2=array[0];
		long big1=array[0];
		for(i=0;i<9;i++)
			System.out.println("array["+i+"] = "+array[i]);
		for(long j:array)
			big1=big1<j?j:big1;
		for(long j:array)
			big2=((big2<j)&&(big1>j))?j:big2;
		System.out.println(big2+" is the second largest number.");
		System.out.println("Elements of array in reverse : ");
		for(i=array.length-1;i>=0;i--)
			System.out.print(array[i]+" ");
		
		SortArray sort=new SortArray();
		array=sort.getAscendingOrder(array);
		System.out.println("\n"+array[2]+" is the third smallest number.");
		
	
	}

}
