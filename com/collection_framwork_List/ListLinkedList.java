package com.collection_framwork_List;

import java.util.Iterator;
import java.util.Vector;

public class ListLinkedList {
	public static void main(String[] args) {
		ListLinkedList v =new ListLinkedList();
		
		v.add("poo");// add()used for add elements// below array size is 5 
		v.add("78");
		v.add("poo");
		v.add("hello");
		v.add(4, 22);
		// v.add(9 , 22); // add(index, element) // (size > intex) always otherwise  //ArrayIndexOutOfBoundsException
	    System.out.println(v);
	// we get answer in the form of array
	    
	    System.out.println(v.size());//find size
    	System.out.println(v.lastElement());
    	System.out.println(v.capacity());
	
	    Iterator itr = v.iterator(); // iterator used for electents la baher kadnya sathi
	    while(itr.hasNext()) { //hasnext used for array madhe element aahe ki nahi
	    	Object obj = itr.next();
	    	if(obj instanceof String) {
	    		String s = (String) obj;
	    		System.out.println("String data :" +s);
	    	}else if(obj instanceof Integer) {
	    		Integer i = (Integer) obj;
	    		System.out.println("Integer data :" +i);

}
	    }
	}

	private char[] capacity() {
		// TODO Auto-generated method stub
		return null;
	}

	private Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private char[] lastElement() {
		// TODO Auto-generated method stub
		return null;
	}

	private char[] size() {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}
}
