package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.FunctionalInterface.Emp;
import com.FunctionalInterface.EmpRepository;

public class FilterExample {

	static Predicate<Emp> age =  e -> e.getAge()>20;
	static Predicate<Emp> designation = e -> e.getDesignation().equals("Tester");
	public static void main(String[] args) {

		//List<String> names = Arrays.asList("apple","orange","grapes","oil","man");
		//Stream<String> updatednames = names.stream().filter(s -> s.length() > 3);
		//updatednames.forEach(System.out :: println);
		
		EmpRepository.getAllEmp()
		.stream()
		.filter(age.and(designation))
		//.filter(designation)
		.collect(Collectors.toList())
		.forEach(System.out :: println);
	}

}
