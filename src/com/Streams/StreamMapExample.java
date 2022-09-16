package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.FunctionalInterface.Emp;
import com.FunctionalInterface.EmpRepository;

public class StreamMapExample {
	
	static Function<Emp,String> f1 = Emp :: getName;// e -> e.getName()
	static Function<String,String> f2 = s -> s.toUpperCase();
	
	static List<String> toUppertransform(List<Emp> listoFemp){
		
		return listoFemp.stream()
				.map(Emp :: getName)// .map(f1)
				.map(String :: toUpperCase)// .map(f2)
				.collect(Collectors.toList());
	}
	static List<String> toLowertransform(List<Emp> listoFemp){
		
		return listoFemp.stream()
				.map(Emp :: getName)
				.map(String :: toLowerCase)
				.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Hostel","Apartment","Building","House");
		List<Integer> intlist = fruits.stream()
				.map(String :: length)
				.collect(Collectors.toList());
		
		System.out.println(intlist);
		
		System.out.println("Upper: "+toUppertransform(EmpRepository.getAllEmp()));
		System.out.println("Upper: "+toLowertransform(EmpRepository.getAllEmp()));
	}
	
	

}
