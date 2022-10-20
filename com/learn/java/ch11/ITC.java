package com.learn.java.ch11;
class ObjectClass{
	boolean valueSet=true;
	synchronized void doMethod(Object threadObject){
		System.out.println(threadObject.getClass().getName()+".doMethod()\t");
		while(!valueSet) {
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}
		System.out.println(threadObject.getClass().getName()+"\n");
		valueSet=false;
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			System.out.println("InterruptedException caught");
		}
		notify();	
	}
	synchronized void doAnotherMethod(Object threadObject){
		System.out.println(threadObject.getClass().getName()+".doAnotherMethod()\t");
		while(valueSet) {
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}
		System.out.println(threadObject.getClass().getName()+"\n");
		valueSet=true;
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			System.out.println("InterruptedException caught");
		}
		notifyAll();
	}
}
class Thread1 implements Runnable{
	ObjectClass obj;
	Thread1(ObjectClass object){
		obj = object;
		new Thread(this).start();
	}
	@Override
	public void run() {
		while(true) {
			obj.doMethod(this);
		}
	}
	
}
class Thread2 implements Runnable{
	ObjectClass obj;
	Thread2(ObjectClass object){
		obj = object;
		new Thread(this).start();
	}
	@Override
	public void run() {
		while(true) {
			obj.doAnotherMethod(this);
		}
	}
	
}
class Thread3 implements Runnable{
	ObjectClass obj;
	Thread3(ObjectClass object){
		obj = object;
		new Thread(this).start();
	}
	@Override
	public void run() {
		while(true) {
			obj.doMethod(this);
		}
	}
	
}
class Thread4 implements Runnable{
	ObjectClass obj;
	Thread4(ObjectClass object){
		obj = object;
		new Thread(this).start();
	}
	@Override
	public void run() {
		while(true) {
			obj.doAnotherMethod(this);
		}
	}
	
}
public class ITC {
	public static void main(String[] args) {
		ObjectClass obj = new ObjectClass();
		new Thread1(obj);
		new Thread2(obj);
		new Thread3(obj);
		new Thread4(obj);

	}

}
