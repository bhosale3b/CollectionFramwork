package com.collection_framwork_SortingFor_list_Comparator_Cursers;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@ToString

public  class ComparableEmp implements Comparable{
	
  private int id;
  private  String name;
  private  double salary;
  
  @Override
  public int compareTo( Object o)
  {
	  ComparableEmp e = (ComparableEmp) o;
	//return e.getName().compareTo(this.name);
	
	
	if(e.getSalary()==this.salary) //used for sorting
		return 0;
	else if (e.getSalary() < this.salary)
		return 1;
	
	else 
		return -1;
	
	

  


  }
}
