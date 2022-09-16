package com.Streams;

import java.util.function.Predicate;

import com.FunctionalInterface.Emp;
import com.FunctionalInterface.EmpRepository;

public class MapFilterReduceExample {

	static Predicate<Emp> age =  e -> e.getAge()>20;
	static Predicate<Emp> designation = e -> e.getDesignation().equals("Tester");
	
	public static void main(String[] args) {

		Double sumSalary = EmpRepository.getAllEmp()
				.stream()
				.filter(age.and(designation))
				.map(Emp :: getSalary)
				.reduce((double) 0,(x,y)->x+y);
		
		System.out.println(sumSalary);
	}

}
