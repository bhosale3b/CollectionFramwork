package com.collection_framwork_List;

import java.util.Stack;

public class ListStack {
	
	public static void main(String[] args) {
		
	 Stack st = new Stack();
		st.push(23);// add
		st.add(89);
		st.push(23);
		st.add(null);
		st.add(null);
		
		System.out.println(st);
		System.out.println(st.pop());//remove
		System.out.println(st.peek());//top of the element
		System.out.println(st);
		System.out.println(st.search(23));// search if present count how much , otherwise -1
		System.out.println(st.search(67));
		
	}

}
