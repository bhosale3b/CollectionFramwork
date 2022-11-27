package com.collection_framwork_SortingFor_list_Comparator_Cursers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<ComparableEmp> emp= new ArrayList();
		
		emp.add(new ComparableEmp(123,"poo",900000));
		emp.add(new ComparableEmp(193,"pty",890000));
		emp.add(new ComparableEmp(173,"puo",900780));
		emp.add(new ComparableEmp(129,"popo",908900));
		
		/*Iterator it =emp.iterator();//ConcurrentModificationException
		while(it.hasNext()) {
			emp.add(new ComparableEmp(189,"poui",907540));// not add in iterator (fail fast)
			ComparableEmp e = (ComparableEmp) it.next();
			System.out.println(e);
		}*/
		
		ListIterator it =emp.listIterator();
		while(it.hasNext()) {
			//it.add(new ComparableEmp(189,"poui",907540));//  add in iterator (fail safe)
			ComparableEmp e = (ComparableEmp) it.next();
			System.out.println(e);
		}
		while(it.hasPrevious()){
			ComparableEmp e = (ComparableEmp) it.previous();
			System.out.println(e);
			
		}
		 System.out.println(emp);
			 
		}
		
		
		
	}


