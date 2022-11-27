package com.collection_framwork_SortingFor_list_Comparator_Cursers;

import java.util.ArrayList;
import java.util.Vector;

public class Enumeration {
public static void main(String[] args) {
		
		Vector<ComparableEmp> emp= new Vector<ComparableEmp>();
		
		emp.add(new ComparableEmp(123,"poo",900000));
		emp.add(new ComparableEmp(193,"pty",890000));
		emp.add(new ComparableEmp(173,"puo",900780));
		emp.add(new ComparableEmp(129,"popo",908900));
		
		Enumeration e =  emp.elements();
		while(e.hasMoreElements()) {
			ComparableEmp emps = (ComparableEmp) e.nextElement();
			System.out.println(emps);
			
		}
		
}


}
