package com.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class EmpRepository {

	
	
	public static Emp getEmp(){
		
		return new Emp("mani", 31, 90000, "Tester", "female");
		
		
	}
	
	public static List<Emp> getAllEmp(){
		List<Emp> l = new ArrayList<>(); 
		l.add(new Emp("Kaviya", 23, 80000, "Tester", "female"));
		l.add(new Emp("logu", 43, 10000, "Developer", "male"));
		l.add(new Emp("gokul", 17, 60000, "Tester", "male"));
		l.add(new Emp("viga", 8, 1000, "Tester", "female"));
		l.add(new Emp("mani", 31, 90000, "Tester", "female"));
		
		return l;
		
	}

}
