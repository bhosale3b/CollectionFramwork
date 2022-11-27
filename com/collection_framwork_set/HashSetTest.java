package com.collection_framwork_set;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet hs =  new HashSet();

		hs.add(89);
		hs.add("poo");
		hs.add("hello");
		hs.add(89);
		hs.add(80);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);



}
}