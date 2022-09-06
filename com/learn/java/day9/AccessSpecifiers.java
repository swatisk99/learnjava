package com.learn.java.day9;

import java.io.IOException;
import java.util.Scanner;
import com.learn.java.intro.*;

class Stack{
	private int top=-1;
	private double stack[];
	private int size;
	Stack(int size){
		this.size = size;
		this.stack= new double [size];
	}
	Stack() {
		this.size = 5;
		this.stack = new double[5];
	}
	void push(double element) {
		if(top==size) {
			System.out.println("Stack is full. Cannot add "+element);
		}
		else if(++top==size) {
			System.out.println();
		}
		else {
			stack[top] = element;
		}
	}
	void pop() {
		if(top<0) {
			System.out.println("Stack is empty");
		}
		else if(top==0) {
			System.out.println(stack[top--]+" is popped fro  stack\n Stack is now empty");
		}
		else {
			System.out.println(stack[top--]+" is popped fro  stack");
		}
	}
	void display() {
		for(double i:stack) {
			System.out.print(i+" ");
		}
	}
	
}
public class AccessSpecifiers {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter stack size : ");
		int size = scan.nextInt();
		Stack s = new Stack(size);
		int continueOption,choice;
		do {
			System.out.println("1.Push\t2.Pop\t3.Display stack\nEnter choice");
			choice=scan.nextInt();
			switch (choice) {
				case 1:	System.out.print("enter element to be pushed : ");
					s.push(scan.nextInt());
					break;
				case 2:	s.pop();
					break;
				case 3: s.display();
						break;
				default:
					System.out.println("Invalid choice");					
			}System.out.println("TO CONTINUE ENTER 1!");
			continueOption=scan.nextInt();
		}while(continueOption==1);
	System.out.println("Stack Program terminated");
	
	//accessing private class from another class
	//System.out.println(s.top);  => Unresolved compilation problem: The field Stack.top is not visible
	
	
	//accessing default class
	Outer o = new Outer();
	
	//accessing public class
	HelloWorld hw = new HelloWorld();
	hw.main(args);
	
	
	//protected applies only when inheritance is involved.
	}

}
