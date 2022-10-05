package com.learn.java.ch9.a;

import com.learn.java.ch9.PersonDetails;

class Person implements PersonDetails {
	@Override
	public void setName(String name) {
		if(NAME.equals(new StringBuilder())) {
			NAME.append( new StringBuilder(name));
		}
		else {
			int len= NAME.length();
			System.out.println(len);
			NAME.replace(0, (len),name);
		}
	}
	
	public void setNickname(String nn) {
		NICKNAME.concat(nn);
	}
	@Override
	public StringBuilder getName() {
		// TODO Auto-generated method stub
		return NAME;
	}
	public String getNickname() {
		// TODO Auto-generated method stub
		return NICKNAME;
	}
	
	

}

public class ImplementPersonDetails{
	public static void main(String...args) {
		Person swati = new Person();
		swati.setName("Swati Krishna");
		System.out.println(swati.getName());
		swati.setNickname("malu");
		System.out.println(swati.getNickname());
		swati.setName("Swathi Krishna");
		System.out.println(swati.getName());
		
	}
}