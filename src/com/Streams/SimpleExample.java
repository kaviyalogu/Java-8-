package com.Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.FunctionalInterface.Emp;
import com.FunctionalInterface.EmpRepository;

public class SimpleExample {

	public static void main(String[] args) {
		
		Stream<Integer> s1 = Stream.of(1,2,3,4,5,6);
		//s1.forEach(e -> System.out.println(e));
		
		Integer arr[] = new Integer[]{11,22,33,44,55};
		Stream<Integer>  s2 = Stream.of(arr);
		//s2.forEach(e ->System.out.println(e));
		
		Map<String,Double> map = EmpRepository.getAllEmp()
				.stream()
				//.filter(e -> e.getAge() > 20)
				//.filter(e -> e.getDesignation().equals("Tester"))
				.collect(Collectors
						.toMap(Emp :: getName, Emp :: getSalary));
		
		System.out.println(map);
		
		List<String> empMap = EmpRepository.getAllEmp()
				.stream()
				.map(Emp :: getName)
				.collect(Collectors.toList());
				System.out.println(empMap);
		//distinct()
		//flatmap()
		
		
		
	}

}
