package com.learn.java.ch9.quest;

import java.util.Scanner;

public class ObjectCreator {
	static byte tryNumber=0;

	/**<T> the type of the class modeled..eg: the type = String =>  Class<String>}.  
	 * Class<?> if the class being modeled is unknown.
	 * @throws Exception 
	 */
	public Class<?> createObject(String className){
		Class<?> object = null;
		try {System.out.println(className);
			object = Class.forName(className,true,this.getClass().getClassLoader());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return object;
	}
	
}
