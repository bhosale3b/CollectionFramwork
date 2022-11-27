package com.collection_framwork_MAP;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
	public static void main(String[] args) {
		 

		
		ConcurrentHashMap hm = new ConcurrentHashMap();
		hm.put("poo", "a");
		
	Set<String> s	=hm.keySet();
	for (String string : s) {
		hm.put("boo", "g");//fail safe
		System.out.println(hm);
		
		
		System.out.println("___________________________");
		
		HashMap mm = new HashMap();
		mm.put("er", "ty");
		
		 Set<String> m =mm.keySet();
		 for (String string2 : m) {
			 //mm.put("kr", "hu");// can't add in hashmap // we use for ConcurrentHashMap // fail fast 
			 System.out.println(mm);
		}
	}
		
	}
	

}
