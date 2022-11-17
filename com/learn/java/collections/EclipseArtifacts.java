//$Id$
package com.learn.java.collections;

import java.io.*;
import java.util.*;

public class EclipseArtifacts {
	public static void main(String...args) throws InvalidPropertiesFormatException, FileNotFoundException, IOException {
		Properties p = new Properties();
		p.loadFromXML(new FileInputStream("/Applications/Eclipse.app/Contents/Eclipse/artifacts.xml"));
		System.out.println(p);
//		BitSet
	}
}
