package com.FunctionalInterface;

public class Emp{


	private String  name;
	private int age;
	private double salary;
	private String designation;
	private String gender;
	
	public Emp(String name,  int age, double salary,String designation, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", designation=" + designation + ", age=" + age + ", salary=" + salary + ", gender=" + gender + "]";
	}
	
	

	
}
