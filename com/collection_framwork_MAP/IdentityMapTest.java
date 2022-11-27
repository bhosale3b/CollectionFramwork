package com.collection_framwork_MAP;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityMapTest {
public static void main(String[] args) {
	
	
       HashMap hm = new HashMap();
       hm.put("poo", 1);// here check content
       //hm.put( new String ("poo") , 3);
       hm.put("poo", 3);
       System.out.println(hm);
       System.out.println("_________________");

  IdentityHashMap im = new IdentityHashMap();// internal check by key ==
  
  im.put("poo", 1);
  //im.put( new String ("poo") , 3);
  hm.put("poo", 3);
  System.out.println(im);
  
}

}