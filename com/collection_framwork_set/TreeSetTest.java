package com.collection_framwork_set;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet hs =  new TreeSet();

			hs.add(89);
			//hs.add("poo"); // homogeous data only
			//hs.add("hello");
			hs.add(89);
			hs.add(80);
			//hs.add(null);null not allow
			//hs.add(null);
			
			System.out.println(hs);



}
}