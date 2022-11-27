package com.collection_framwork_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.DelayQueue;

public class DeQueueTest {
	public static void main(String[] args) {
		
		ArrayDeque d = new ArrayDeque();
		d.add("R");
		d.add("A");
		d.add("D");
		d.add("R");
		d.addFirst("u");
		d.addLast("w");
		d.add(8);
		
		System.out.println(d);
		
	}

}
