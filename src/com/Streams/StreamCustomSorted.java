package com.Streams;

import java.util.Comparator;

import com.FunctionalInterface.Emp;
import com.FunctionalInterface.EmpRepository;

public class StreamCustomSorted {

	public static void main(String[] args) {
		System.out.println("Sort By Name: ");
		EmpRepository.getAllEmp()
		.stream()
		.sorted(Comparator.comparing(Emp :: getName))
		.forEach(System.out :: println);//e ->sysout(e);
		
		System.out.println("Sort By Age: ");
		EmpRepository.getAllEmp()
		.stream()
		.sorted(Comparator.comparing(Emp :: getAge))
		.forEach(System.out :: println);//e ->sysout(e);
		
		System.out.println("Sort By Age in Reverse: ");
		EmpRepository.getAllEmp()
		.stream()
		.sorted(Comparator.comparing(Emp :: getAge).reversed())
		.forEach(System.out :: println);//e ->sysout(e);
	}

}
