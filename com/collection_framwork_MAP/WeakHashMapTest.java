package com.collection_framwork_MAP;

import java.util.WeakHashMap;

public class WeakHashMapTest {
	public static void main(String[] args) {
		
		
		WeakHashMap wm = new WeakHashMap();
		
	 Weakhashmap  wm1= new Weakhashmap();
		wm.put(wm1, 9);
		wm1=null;
		System.gc();
		System.out.println(wm);
	}

}
