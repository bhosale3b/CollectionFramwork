package com.collection_framwork_MAP;

import java.util.Properties;

public class PropertiesMap {
	public static void main(String[] args) {
		
		Properties pm = new Properties();
		
		pm.setProperty("poo", "ki");//string data allow only 1.0 jdk but homogenous string
		//pm.setProperty(6, 8); allow only string
		//pm.setProperty(null, null); NullPointerException
		pm.put(4, 8);// jdk 1.2 all hetrogenious data lso use put method
		System.out.println(pm);
	}

}
