package com.learn.java.day10;

class MyObject implements Cloneable{
	private String objectName;
	private long objectId;
	
	MyObject(String name,long id){
		objectName= name;
		objectId=id;
	}
	public boolean equals(Object obj) {
		if(hashCode()==obj.hashCode()) {
			if(this==obj) {
				return true;
			}
			else {
				MyObject object = (MyObject)obj;
				return (this.objectName==object.objectName)?((this.objectId==object.objectId)?true:false):false;
			}
		}
		else {
			System.out.println("4");

			return false;
		}
    }

	public String toString() {
        return getClass().getName()+"@"+hashCode();
    }
	
	/**
	 * By convention, classes that implement this interface should override
	 * Object.clone (which is protected) with a public method.
	 */
	public Object clone() throws CloneNotSupportedException {
		System.out.println(this+"\t"+super.clone());
		return super.clone();
	}
	
	/**
	 * Overrides hashCode() of Object.class
	 * returns objectId%1000
	 */
	public int hashCode() {
		return (int)objectId/50;
	}
	
}

public class ObjectOverride implements Cloneable{		//if Cloneable not implemented, throws CloneNotSupportedException

	public static void main(String[] args) throws CloneNotSupportedException {
		MyObject obj1 = new MyObject("Swati",15154);
		MyObject obj2 = new MyObject("Krishna",16154);
		MyObject obj3 = new MyObject("Swati",15154);
		MyObject obj4 = new MyObject("Krishna",15153);
		
		System.out.println("Use overridden methods of Object.class");
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj4));
		System.out.println(obj1.equals(obj3));
		
		System.out.println(obj1+"\n"+obj2+"\n"+obj3+"\n"+obj4);
		
		Object obj5=obj4.clone();			//	The method clone() from the type Object is not visible
		System.out.println("Object5(clones Object4)==Object4?\t"+obj5.equals(obj4));
		System.out.println(obj5);
		
		System.out.println("\n\nUse methods of Object.class");
		ObjectOverride object1 = new ObjectOverride();
		ObjectOverride object2 = new ObjectOverride();
		System.out.println(object1.equals(object2));
		System.out.println("Object1 : "+object1+"\t Hashcode : "+object1.hashCode());
		Object object3 = object2.clone();
		System.out.println("Object3(clones Object1) : "+object3+"\nObject3 == Object1? "+object1.equals(object3));
		
		/**
		System.out.println(String.class.getName());									java.lang.String
	    System.out.println(byte.class.getName());									byte
	    System.out.println((new Object[3]).getClass().getName());					[Ljava.lang.Object;
	    System.out.println((new ObjectOverride()).getClass().getName());			com.learn.java.day10.ObjectOverride
	    System.out.println((new int[3][4][5][6][7][8][9]).getClass().getName());	[[[[[[[I
	    System.out.println((new BigInteger[3][4][5][6][7][8][9]).getClass().getName());	[[[[[[[Ljava.math.BigInteger;
	    */
			}

}
