package com.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.FunctionalInterface.Emp;

public class PredicateDemo {

	static List<Emp> l = new ArrayList<>();
	static Predicate<Emp> agePredicate = e -> e.getAge() > 20;
	static Predicate<Emp> designationPredicate =e ->e.getDesignation().equals("Tester");
	static BiPredicate<Integer,String> ageandgender = (age,gender)-> age > 20 && gender.equals("male");
	public static void main(String[] args) {

		Predicate<Integer> less = a -> a<50;
		Predicate<Integer> greater = a -> a>50;
		Predicate<Integer> equal = a -> a==50;
		//System.out.println(less.test(20));
		//System.out.println(less.and(greater).test(20)); // t and f => f
		//System.out.println(less.or(greater).test(20));  // t or f => t
		//System.out.println(agePredicate.test(e));
		l.add(new Emp("Kaviya", 23, 80000, "Tester", "female"));
		l.add(new Emp("logu", 43, 10000, "Developer", "male"));
		l.add(new Emp("gokul", 17, 60000, "Tester", "male"));
		l.add(new Emp("viga", 8, 1000, "Tester", "female"));
		l.add(new Emp("mani", 31, 90000, "Tester", "female"));
		System.out.println("Predicate");
		l.forEach(e ->{
			if(agePredicate.and(designationPredicate).test(e))
				System.out.println(e);
		});
		System.out.println("BiPredicate");
		l.forEach(e -> {
			if(ageandgender.test(e.getAge(), e.getGender()))
				System.out.println(e);
		});
	}

}
