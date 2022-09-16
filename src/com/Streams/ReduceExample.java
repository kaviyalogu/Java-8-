package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

import com.FunctionalInterface.Emp;
import com.FunctionalInterface.EmpRepository;

public class ReduceExample {

	static BinaryOperator<Integer> bo1 = (a,b) -> a+b;
	static BinaryOperator<Integer> bo2 = (a,b) -> a*b;
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Optional<Integer> op = list.stream().reduce((a,b) -> a+b);//(bo)
		// 1 + 2 = 3
		// 3 + 3 = 6
		// 6 + 4 = 10
		// 10 + 5 10 + 5 = 15
		System.out.println(op);
		System.out.println(op.get());
		
		int sum = list.stream().mapToInt(i -> i).sum();
		System.out.println("Using map to Int:"+sum);
		
		int add = list.stream().reduce(0, bo1);
		System.out.println("Addition with second reduce method: "+add);
		
		int mul = list.stream().reduce(0, bo2);
		System.out.println("Multiplication with second reduce method: "+mul);
		
		combineNames();
		elderEmp();
	}

	public static void combineNames(){
		String names = EmpRepository.getAllEmp()
				.stream()
				.map(Emp :: getName)
				.reduce("", (a,b)->a.concat(b));
		
		System.out.println("combine names into a string: "+names);
	}
	
	public static void elderEmp(){
		Optional<Emp> elderOne =EmpRepository.getAllEmp()
		.stream()
		.reduce((x,y)->x.getAge() > y.getAge() ? x : y);
		
		System.out.println("eldest Employee: "+elderOne);
		System.out.println("eldest Employee without optional: "+elderOne.get());
	}
}
