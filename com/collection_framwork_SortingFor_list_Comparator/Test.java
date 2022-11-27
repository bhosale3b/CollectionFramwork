package com.collection_framwork_SortingFor_list_Comparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Test {
	
           public static void main(String[] args) {
			
			ArrayList<ComparableEmp> emp= new ArrayList();
			
			emp.add(new ComparableEmp(123,"poo",900000));
			emp.add(new ComparableEmp(193,"pty",890000));
			emp.add(new ComparableEmp(173,"puo",900780));
			emp.add(new ComparableEmp(129,"popo",908900));
			
			
			
			
			for (Object object : emp) {
				 ComparableEmp e = (ComparableEmp) object;
				 System.out.println(e);
				
				 
			}
			
			System.out.println("---------namewise---------");
			
			Collections.sort(emp,new NameWiseSorting());
			
			for (Object object : emp) {
				 ComparableEmp e = (ComparableEmp) object;
				 System.out.println(e);
				
				 
			}
			System.out.println("---------salarywise---------");
			
			Collections.sort(emp,new SalaryWiseSorting());
			
			for (Object object : emp) {
				 ComparableEmp e = (ComparableEmp) object;
				 System.out.println(e);
				
				 
			}
			
			
			
		}

	}


