package com.FunctionalInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

	public static void main(String[] args) {
		List<Emp> l = new ArrayList<>(); 
		l.add(new Emp("Kaviya", 23, 80000, "Tester", "female"));
		l.add(new Emp("logu", 43, 10000, "Developer", "male"));
		l.add(new Emp("gokul", 17, 60000, "Tester", "male"));
		l.add(new Emp("viga", 8, 1000, "Tester", "female"));
		l.add(new Emp("mani", 31, 90000, "Tester", "female"));
		
		BiFunction<String,String,String> bf1 = (a,b) -> a.concat(b);
		System.out.println(bf1.apply("kaviya", " logu"));
		
		Predicate<Emp> agepredicate = a -> a.getAge() > 20;
		Predicate<Emp> designationPredicate =e ->e.getDesignation().equals("Tester");
		BiFunction<List<Emp>,Predicate<Emp>,Map<String,Double>> bf2 = (l1,predicate)->{
			Map<String,Double> map = new HashMap<>();
			l.forEach(e ->{
				if(predicate.test(e))
					map.put(e.getName(), e.getSalary());
			});
			return map;
		};
	
		System.out.println(bf2.apply(l, agepredicate.and(designationPredicate)));
				
	}

}
