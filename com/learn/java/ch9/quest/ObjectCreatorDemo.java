package com.learn.java.ch9.quest;
import java.util.*;
import java.lang.reflect.*;

public class ObjectCreatorDemo {

	public static void main(String[] args) throws ClassNotFoundException	{
		
		Class<?> obj;
		try {
			//ClassNotFoundException : occurs when Class.forName() or loadClass()
			//methods are used and mentioned classes are not found in the classpath.
			obj = Class.forName("com.learn.java.ch9.quest.PersonalDetails");
			System.out.println(obj.getName());
			//obj.newInstance();
			Field [] fields = obj.getDeclaredFields();
			Method [] methods = obj.getDeclaredMethods();
			for(Field field : fields) {
				System.out.println(field.getName());
			}
			for(Method method : methods) {
				System.out.println(method.getName());
				//obj.getMethod("getName");		//java.lang.NoSuchMethodException since the method is private
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
