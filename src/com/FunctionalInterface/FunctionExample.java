package com.FunctionalInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {

	/*static Function<String,Integer> f1 = s -> s.length();
	static Function<String,String> f2 = s -> s.toUpperCase();
	static Function<String,String> f3 = s -> s.toUpperCase().concat(" kavin");*/
	static List<Emp> l = new ArrayList<>(); 

	static Predicate<Emp> agePredicate = e -> e.getAge() > 20;
	static Predicate<Emp> designationPredicate =e ->e.getDesignation().equals("Tester");
	static Function<List<Emp>,Map<String,Double>> f = (list) ->{
		Map<String,Double> hp = new HashMap<>();
		
		l.forEach(e ->{
			if(agePredicate.and(designationPredicate).test(e)){
				hp.put(e.getName(), e.getSalary());
			}
		});
		
		
		return hp;
	};
	
	public static void main(String[] args) {

		/*System.out.println(f1.apply("kaviya"));
		System.out.println(f2.apply("kaviya"));
		System.out.println(f3.apply("kaviya"));
		System.out.println("AndThen:  "+f2.andThen(f3).apply("kaviya"));
		System.out.println("compose "+f2.compose(f3).apply("kaviya"));
		
		Function<Integer,Integer> f4 = s -> s*2;
		Function<Integer,Integer> f5 = s -> s*s;
		
		System.out.println("AndThen : "+f4.andThen(f5).apply(10));
		System.out.println("Compose :"+f4.compose(f5).apply(10));*/
		Function<String,String> fun = Function.identity();
		System.out.println(fun.apply("java"));
		l.add(new Emp("Kaviya", 23, 80000, "Tester", "female"));
		l.add(new Emp("logu", 43, 10000, "Developer", "male"));
		l.add(new Emp("gokul", 17, 60000, "Tester", "male"));
		l.add(new Emp("viga", 8, 1000, "Tester", "female"));
		l.add(new Emp("mani", 31, 90000, "Tester", "female"));
		
		System.out.println(f.apply(l));
	}

}
