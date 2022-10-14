package com.learn.java.ch9.interfaces;
/**
 * The nested interfaces are used to group related interfaces so that they can be easy to maintain. 
 */
public interface OuterInterface {
	public static final double PI=3.14;
	
	void sayOuter();
	
	//public static void sayStatic();		//This method requires a body instead of a semicolon since static methods are not overridden
	
	/**
	 * Since Java 8, iface can have default and static methods also.
	 */
	public static void saySomething() {
		System.out.println("Static method in Outer Interface");
	}
	
	public default void sayDefault() {
		System.out.println("Default method in interface");
	}
	public interface InnerInterface{
		//public static final double PI=22/7;
		public void sayInner();
	}
}
