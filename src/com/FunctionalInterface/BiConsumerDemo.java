package com.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

import com.FunctionalInterface.Emp;

public class BiConsumerDemo {
	static List<Emp> l = new ArrayList<>(); 
	static BiConsumer<String,Double> income =(name,salary) -> System.out.println(name+"-"+salary);
	
	
	public static void main(String[] args) {
		BiConsumer<Integer,Integer> bc1 = (a,b) ->System.out.println("Add: "+(a+b));
		BiConsumer<Integer,Integer> bc2 = (a,b) ->System.out.println("sub: "+(a-b));
		bc1.andThen(bc2).accept(50, 30);
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5);
		List<Integer> l2 = Arrays.asList(1,2,3,4,5);
		
		BiConsumer<List<Integer>,List<Integer>> sizecheck =(list1,list2) ->{
			if(list1.size() == list2.size())
				System.out.println("True");
			else
				System.out.println("False");
		};
		
		sizecheck.accept(l1, l2);
		
		
		
		
		
		l.add(new Emp("Kaviya", 23, 80000, "Tester", "female"));
		l.add(new Emp("logu", 43, 10000, "Developer", "male"));
		l.add(new Emp("gokul", 17, 60000, "Tester", "male"));
		l.add(new Emp("viga", 8, 1000, "Tester", "female"));
		l.add(new Emp("mani", 31, 90000, "Tester", "female"));
		
		fetchIncome();
		
	}

	 static void fetchIncome() {
		l.forEach(e ->{
		   income.accept(e.getName(), e.getSalary());
		});
	}

}
