package com.learn.java.ch9.quest;
import java.util.*;
import java.lang.reflect.*;

public class ObjectCreatorDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> obj;

		try { 
			obj = Class.forName("com.learn.java.ch9.quest.PersonalDetails");
			System.out.println(obj.getClass().getName());
			Field [] fields = obj.getDeclaredFields();
			Method [] methods = obj.getDeclaredMethods();
			for(Field field : fields) {
				System.out.println(field.getName());
			}
			for(Method method : methods) {
				System.out.println(method.getName());
			}
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		}
	}

}
