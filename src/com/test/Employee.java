package com.test;

import java.util.Comparator;

public class Employee implements Comparator{

	private int id;
	private String name;
	private double salary;
	
	public Employee(){
		
	}
	
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		if( e1.getId()>e2.getId())
			return 1;
		else if(e1.getId()<e2.getId())
			return -1;
		else
			return 0;
	}
	
	
}
