package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.FunctionalInterface.Emp;
import com.FunctionalInterface.EmpRepository;

public class FlatterMapExample {

	static List<String>  getnames(List<Emp> listOfemp){
		return listOfemp.stream()
				.map(Emp :: getName)
				.sorted()
				.distinct()
			    //.flatMapToInt(String :: length)
				.collect(Collectors.toList());
	}
	
	
	static long  countOfnames(List<Emp> listOfemp){
		return listOfemp.stream()
				.map(Emp :: getName)
				.distinct()
				.count();
	}
	public static void main(String[] args) {

		List<Integer> oddlist = Arrays.asList(1,3,5,7,9);
		List<Integer> evenlist = Arrays.asList(2,4,6,8,10);
		
		List<List<Integer>> bothlist =Arrays.asList(oddlist,evenlist);
		System.out.println("before flatmap : "+bothlist);
		
		List<Integer> flattenlist = bothlist.stream()
				.flatMap(List :: stream)// l -> l.stream()
				.collect(Collectors.toList());
		
		System.out.println("After flatmap: "+flattenlist);
		System.out.println(FlatterMapExample.getnames(EmpRepository.getAllEmp()));
		System.out.println(FlatterMapExample.countOfnames(EmpRepository.getAllEmp()));
	}

}
