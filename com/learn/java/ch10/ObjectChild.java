package com.learn.java.ch10;

public class ObjectChild {
    public Object clone() throws CloneNotSupportedException{//Exception{			//Exception is not compatible with throws clause in Object.clone()
    	return super.clone();
    }


}
