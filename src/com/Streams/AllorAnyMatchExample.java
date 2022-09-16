package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.FunctionalInterface.Emp;
import com.FunctionalInterface.EmpRepository;

public class AllorAnyMatchExample {

	
	static Predicate<String> p1 = s ->s.length() > 4;
	static Predicate<String> p2 = s -> s.length() > 6;
	static Predicate<Emp> p3 = s -> s.getAge() > 20;
	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("apple","orange","graphes","banana","jerry");
		
		System.out.println(fruits.stream().allMatch(p1));
		System.out.println(fruits.stream().anyMatch(p2));
		
		boolean empMatch = EmpRepository.getAllEmp().stream()
				.allMatch(p3);
		System.out.println("empmatch: "+empMatch);
		
		boolean empMatch1 = EmpRepository.getAllEmp().stream()
				.anyMatch(p3);
		System.out.println("empmatch: "+empMatch1);
	}

}
