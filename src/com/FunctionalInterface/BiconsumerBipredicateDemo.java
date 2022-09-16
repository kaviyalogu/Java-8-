package com.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiconsumerBipredicateDemo {
	
	static List<Emp> l = new ArrayList<>(); 
	
	static Predicate<Emp> agePredicate = e -> e.getAge() > 20;
	static Predicate<Emp> designationPredicate =e ->e.getDesignation().equals("Tester");
	
	static BiConsumer<String,Double> income =(name,salary) -> System.out.println(name+"-"+salary);
	static BiPredicate<Integer,String> ageandgender = (age,gender)-> age > 20 && gender.equals("male");
	 static Consumer<Emp> con = e ->{
		//if(agePredicate.and(designationPredicate).test(e))
			 if(ageandgender.test(e.getAge(), e.getGender()))
			 income.accept(e.getName(),e.getSalary());
	 };
	public static void main(String[] args) {

		l.add(new Emp("Kaviya", 23, 80000, "Tester", "female"));
		l.add(new Emp("logu", 43, 10000, "Developer", "male"));
		l.add(new Emp("gokul", 17, 60000, "Tester", "male"));
		l.add(new Emp("viga", 8, 1000, "Tester", "female"));
		l.add(new Emp("mani", 31, 90000, "Tester", "female"));
		
		l.forEach(con);
		
	}

}
