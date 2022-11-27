package com.collection_framwork_MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPar {
	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("pooja", "a");
		hm.put("pooja", "p");
		hm.put("po", "a");
		hm.put(null, null);
		hm.put(null, "b");
		hm.put("ja", null);
		hm.put("amit", "c");
		
		System.out.println(hm);
		
		 Set<String>  s=hm.keySet(); //retrun the set of key only
		 for (String key : s) // for itration
				
		 {
			 String value=hm.get(key); // retrun values
			System.out.println(key+ ": "+ value);
		}
		 
		 System.out.println("----------------------");
		  Set<Map.Entry<String, String>>  s2= hm.entrySet();
		  for (Map.Entry<String, String> entry : s2) {
			  System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		
	}

}
