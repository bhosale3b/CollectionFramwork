package com.collection_framwork_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		
		//Queue q = new Queue(); can't create
		Queue q = new PriorityQueue();
		q.add("A");
		q.add("Y");
		q.add("U");
		q.add("A");
		q.add("Z");
		//q.add(89);//ClassCastException
		System.out.println(q);
		
		System.out.println("_______________________");
		
		PriorityQueue m = new PriorityQueue();
		
		m.add("A");
		m.add("Y");
		m.add("U");
		m.add("A");
		m.add("Z");
		//m.add(89);//ClassCastException
		
		System.out.println(m);
	}

}
