package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainEmployee {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();
		
		l.add(new Employee(1001,"kaviya",30000));
		l.add(new Employee(1003,"logu",40000));
		l.add(new Employee(999,"logu",40000));

		Collections.sort(l, new Employee());
		System.out.println(l.toString());
		
		Predicate<Employee> greaterSalary = e -> e.getSalary() > 15000;
		
		l.forEach(e ->{
			if(greaterSalary.test(e))
				System.out.println(e.getName());
		});
		
		//List<Employee> l1= l.stream().map(e -> e.compare((Employee)o1,(Employee) o2)).collect(Collectors.toList());
		
		
		
	}
	
	
	
	
    

}
