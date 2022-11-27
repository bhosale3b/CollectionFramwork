package com.collection_framwork_SortingFor_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<ComparableEmp> emp= new ArrayList<ComparableEmp>();
		
		emp.add(new ComparableEmp(123,"poo",900000));
		emp.add(new ComparableEmp(193,"pty",890000));
		emp.add(new ComparableEmp(173,"puo",900780));
		emp.add(new ComparableEmp(129,"popo",908900));
		
		
		
		
		for (Object object : emp) {
			 ComparableEmp e = (ComparableEmp) object;
			 System.out.println(e);
			
			 
		}
		
		System.out.println("-------------------");
		
		Collections.sort(emp);
		
		for (Object object : emp) {
			 ComparableEmp e = (ComparableEmp) object;
			 System.out.println(e);
			
			 
		}
		
		
		
	}

}
