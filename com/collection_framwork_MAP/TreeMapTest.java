package com.collection_framwork_MAP;

import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		
		tm.put("a", 1);
		tm.put("w", 9);
		tm.put("h", "k");
		tm.put("a", null);
		//tm.put(null, 6);//java.lang.NullPointerException
		tm.put("w", 5);
		
		System.out.println(tm);
		
	}

}
