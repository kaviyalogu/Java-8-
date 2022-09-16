package com.MethodReferencing;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

import com.FunctionalInterface.Emp;
import com.FunctionalInterface.EmpRepository;

public class Methodrefinstance {

	static Predicate<Emp> p1 = Methodrefinstance :: checkage;
	static BiPredicate<Emp,Integer> p2 = Methodrefinstance :: checkagewithparam;
	
	
	public static void main(String[] args) {
		
		Methodrefinstance obj = new Methodrefinstance();
		 Function<String, String> f = obj :: sayMyname;
		 System.out.println("checkage :"+p1.test(EmpRepository.getEmp()));
		 System.out.println("checkagewithParam :"+p2.test(EmpRepository.getEmp(), 40));
		 System.out.println("sayMyname :"+f.apply("kaviya"));
	}
	
	public static boolean checkage(Emp e){
		return e.getAge() > 20;
	}
	
	public static boolean checkagewithparam(Emp e, Integer age){
		return e.getAge() >= age;
	}
	
	String sayMyname(String name){
		return "Hi "+name;
	}

}
