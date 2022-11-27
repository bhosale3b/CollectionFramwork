package com.collection_framwork_SortingFor_list_Comparator;

import java.util.Comparator;

public class NameWiseSorting implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		ComparableEmp e1 = (ComparableEmp) o1;
		ComparableEmp e2 = (ComparableEmp) o2;
		
		return e1.getName().compareTo(e2.getName());
	}

}
