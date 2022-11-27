package com.collection_framwork_set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
public static void main(String[] args) {
		
	LinkedHashSet hs =  new LinkedHashSet();

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


