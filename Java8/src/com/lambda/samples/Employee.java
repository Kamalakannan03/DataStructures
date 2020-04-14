package com.lambda.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Employee {
 private int id;
 private String name;
 public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getSalary() {
	return salary;
}

public void setSalary(long salary) {
	this.salary = salary;
}

private long salary;
public Employee(int id, String name, long salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
  
 public Employee() {
	// TODO Auto-generated constructor stub
}

//Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
 List<Employee> empList= new ArrayList<Employee>(); 
 
	  
 
	
	
  public List<Employee> getEmpList() {
	return empList;
}

public void setEmpList(List<Employee> empList) {
	this.empList = empList;
}

/*List<Employee> empList=Arrays.asList(new Employee(1,"Kamal",50000),
									   new Employee(2,"Naveen",100000),
									   new Employee(3,"Shiva",60000));*/
  
}
