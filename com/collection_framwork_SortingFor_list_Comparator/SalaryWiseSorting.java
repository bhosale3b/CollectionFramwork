package com.collection_framwork_SortingFor_list_Comparator;

import java.util.Comparator;

public class SalaryWiseSorting implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		ComparableEmp e1 = (ComparableEmp) o1;
		ComparableEmp e2 = (ComparableEmp) o2;
		
		if(e1.getSalary()==e2.getSalary() ) //used for sorting
			return 0;
		else if (e1.getSalary() < e2.getSalary())
			return 1;
		
		else 
			return -1;
		
		
	}

}
