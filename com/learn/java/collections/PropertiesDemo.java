package com.learn.java.collections;

import java.io.*;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties mac = new Properties();
		mac.setProperty("Brand", "Apple");
		mac.setProperty("Series", "MacBook Pro 14-inch");
		mac.setProperty("OS", "Ventura");
		mac.setProperty("Chip", "Apple M1 Pro");
		mac.setProperty("Memory", "16 GB");
		mac.storeToXML(new FileOutputStream("Mac Properties.xml"), "Author : Swati");
			//		mac.load(new FileInputStream("Mac Properties.xml"));		
			//		System.out.println(mac);								//output format different
		mac.loadFromXML(new FileInputStream("Mac Properties.xml"));
		System.out.println(mac);
		mac.setProperty("User", "swati-15154");
		mac.storeToXML(new FileOutputStream("Mac Properties.xml"), "");
		mac.store(new FileOutputStream("Mac Properties.txt"), "");
		mac.loadFromXML(new FileInputStream("Mac Properties.xml"));
		System.out.println(mac);
	}

}
